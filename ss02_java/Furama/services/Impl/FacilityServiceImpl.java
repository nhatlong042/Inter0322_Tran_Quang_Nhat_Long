package services.Impl;

import models.Facility;
import models.Villa;
import services.FacilityService;
import utils.RegexData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static final String REGEX_STR = "[A-Z][a-z]+";
    private static final String REGEX_ID_VILLA="(SVVL)[-][\\d]{4}";
    private static final String REGEX_AMOUNT="^[1-9]([1][0-9])|(20)$";
    private static final String REGEX_INT="^[1-9]([1][0-9])$";
    private static final String REGEX_AREA="^([3-9]\\d[1-9]\\d{2,})$";
    private static Map<Facility,Integer> facilityIntegerMap= new LinkedHashMap<>();
    private  static Scanner scanner=new Scanner(System.in);
    @Override
    public void display() {
        for(Map.Entry<Facility,Integer> element:facilityIntegerMap.entrySet()){
            System.out.println("Service"+element.getKey()+" Số lần đã thuê: "+element.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        String id = inputId();
        String name = inputName();
        double usableArea = Double.parseDouble(inputArea());
        int cost =Integer.parseInt(inputCost());
        int maxQuantity =Integer.parseInt(inputMaxQuantity());
        System.out.println("Nhập loại cho thuê: ");
        String rentalType = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng: ");
        String roomStandard = scanner.nextLine();
        double poolArea = Double.parseDouble(inputpoolArea());
        int floor =Integer.parseInt(inputFloor());
        Villa villa= new Villa(id,name, usableArea, cost, maxQuantity, rentalType, roomStandard, poolArea, floor);
        facilityIntegerMap.put(villa,0);
        System.out.println("Đã thêm mới villa thành công");
    }
    private String inputId(){
        System.out.println("Nhập id, mã dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_ID_VILLA, "Bạn đã nhập sai định dạng, mã dịch vụ phải có dạng là SVVL-XXXX");
    }
    private String inputName(){
        System.out.println("Nhập tên dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_STR, "Bạn đã nhập sai định dạng, tên dịch vụ phải viết hoa chữ đầu");
    }
    private String inputArea(){
        System.out.println("Nhập diện tích dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_AREA, "Bạn đã nhập sai định dạng, diện tích phải lớn hơn 30");
    }
    private String inputCost(){
        System.out.println("Nhập giá tiền dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_INT, "Bạn đã nhập sai định dạng, giá tiền phải là số dương");
    }
    private String inputFloor(){
        System.out.println("Nhập số tầng dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_INT, "Bạn đã nhập sai định dạng, số tầng phải là số dương");
    }
    private String inputpoolArea(){
        System.out.println("Nhập diện tích hồ bơi: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_AREA, "Bạn đã nhập sai định dạng, diện tích hồ bơi phải lớn hơn 30");
    }
    private String inputMaxQuantity(){
        System.out.println("Nhập số lượng tối đa dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_INT, "Bạn đã nhập sai định dạng, số lượng tối đa phải là số dương");
    }
    @Override
    public void addNewHouse() {

    }

    @Override
    public void addNewRoom() {

    }
}
