use khu_nghi_duong;
-- Cau21
create view v_nhan_vien as
select nv.ma_nhan_vien,ho_ten,ngay_sinh,nv.so_cmnd,nv.luong,nv.so_dien_thoai,nv.email,nv.dia_chi
from nhan_vien nv inner join hop_dong hd on nv.ma_nhan_vien= hd.ma_nhan_vien
where nv.dia_chi like '%Hải Châu%' and year(ngay_lam_hop_dong)=2019 
and month(ngay_lam_hop_dong)=12 and day(ngay_lam_hop_dong)=12;

-- Cau22

Update v_nhan_vien
Set dia_chi = 'Liên Chiểu';

-- Cau23
DELIMITER $$
Create Procedure sp_xoa_khach_hang(in ma_khach_hang int )
begin
delete from khach_hang where ma_khach_hang=ma_khach_hang;
end; $$
DELIMITER ;
-- Thực thi
call sp_xoa_khach_hang(1);

-- Câu 24
DELIMITER $$
create procedure sp_them_moi_hop_dong(in ma_hop_dong int, 
ngay_lam_hop_dong datetime, ngay_ket_thuc datetime,tien_dat_coc double,ma_nhan_vien int,ma_khach_hang int,ma_dich_vu int)
begin
insert into hop_dong(ma_hop_dong , 
ngay_lam_hop_dong , ngay_ket_thuc ,tien_dat_coc ,ma_nhan_vien ,ma_khach_hang ,ma_dich_vu )
values
(ma_hop_dong,ngay_lam_hop_dong,ngay_ket_thuc,
tien_dat_coc,ma_nhan_vien,ma_khach_hang,ma_dich_vu);
end; $$
DELIMITER ;

call sp_them_moi_hop_dong(13,'2020-12-08','2020-12-10',100000,2,10,1);

-- Câu 25
DELIMITER //
create trigger tr_xoa_hop_dong after delete on hop_dong 
for each row
begin
	select concat("Còn lại ", (select count(*) as hd_con_lai from hop_dong), " hợp đồng.") 
		AS LOG INTO OUTFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/log.txt';
end //
DELIMITER ;

drop trigger if exists tr_xoa_hop_dong;
 delete from hop_dong where ma_hop_dong = 13;
 insert into hop_dong value (13,	'2021-06-17',	'2021-06-18',	150000,	3,	4,	1);

-- Câu 26
DELIMITER //
create trigger tr_cap_nhat_hop_dong before update on hop_dong
for each row
begin
	if (new.ngay_ket_thuc - new.ngay_lam_hop_dong < 2) then
		signal sqlstate '45000' set message_text = "Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày.";
	end if;
end //
DELIMITER ;

drop trigger if exists tr_cap_nhat_hop_dong;

update hop_dong set ngay_ket_thuc = '2021-06-20' where ma_hop_dong = 8;

-- Câu 27a

-- Câu 28
DELIMITER $$
create procedure sp_xoa_dich_vu_va_hd_room(in ten_dich_vu varchar(45))
begin
delete from hop_dong
where ma_dich_vu in (select ma_dich_vu from dich_vu where ten_dich_vu like concat('%',ten_dich_vu,'%'));
end; $$
DELIMITER ;
call sp_xoa_dich_vu_va_hd_room('Room');