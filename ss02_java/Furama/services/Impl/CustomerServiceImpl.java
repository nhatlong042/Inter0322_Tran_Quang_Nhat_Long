package services.Impl;

import models.Customer;
import models.Employee;
import services.CustomerService;
import utils.RegexData;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);
    private static final String BIRTHDAY_REGEX="^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";
    @Override
    public void display() {
        for (Customer customer : customerList
        ) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String dateOfbirth= RegexData.regexAge(scanner.nextLine(),BIRTHDAY_REGEX);
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập cmnd: ");
        int cmnd = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại: ");
        String phone = scanner.nextLine();
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.println("Nhập loại khách hàng: ");
        String type = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, dateOfbirth, gender, cmnd, phone, email, type, address);
        customerList.add(customer);
        System.out.println("Đã thêm mới khách hàng thành công");
    }

    @Override
    public void edit() {
        System.out.println("Nhập id cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int size = customerList.size();
        for (int i = 0; i < size; i++) {
            if (customerList.get(i).getId() == id) {
                System.out.println("Nhập tên: ");
                String name = scanner.nextLine();
                System.out.println("Nhập ngày sinh: ");
                String dateOfbirth= RegexData.regexAge(scanner.nextLine(),BIRTHDAY_REGEX);
                System.out.println("Nhập giới tính: ");
                String gender = scanner.nextLine();
                System.out.println("Nhập cmnd: ");
                int cmnd = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập số điện thoại: ");
                String phone = scanner.nextLine();
                System.out.println("Nhập email: ");
                String email = scanner.nextLine();
                System.out.println("Nhập loại dịch vụ: ");
                String type = scanner.nextLine();
                System.out.println("Nhập địa chỉ: ");
                String address = scanner.nextLine();
                String level = scanner.nextLine();
                customerList.get(i).setName(name);
                customerList.get(i).setDateOfbirth(dateOfbirth);
                customerList.get(i).setGender(gender);
                customerList.get(i).setCmnd(cmnd);
                customerList.get(i).setPhone(phone);
                customerList.get(i).setEmail(email);
                customerList.get(i).setType(type);
                customerList.get(i).setAddress(address);
                Customer customer = new Customer(id, name, dateOfbirth, gender, cmnd, phone, email, type, address);
                customerList.add(customer);
            }
        }
    }
    @Override
    public void delete() {
        System.out.println("Nhập id cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int size = customerList.size();
    }
}
