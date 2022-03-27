package services.Impl;

import models.Employee;
import services.EmployeeService;
import utils.ReadAndWrite;
import utils.RegexData;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList= new ArrayList<>();
    private static Scanner scanner= new Scanner(System.in);
    private static final String BIRTHDAY_REGEX="^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";
    @Override
    public void display() {
        employeeList= (List<Employee>) ReadAndWrite.read("C:\\Users\\Admin\\IdeaProjects\\Furama\\src\\data\\employee.csv");
        for (Employee employee:employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        int id= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name= scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String dateOfbirth= RegexData.regexAge(scanner.nextLine(),BIRTHDAY_REGEX);
        System.out.println("Nhập giới tính: ");
        String gender= scanner.nextLine();
        System.out.println("Nhập cmnd: ");
        int cmnd= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại: ");
        String phone= scanner.nextLine();
        System.out.println("Nhập email: ");
        String email= scanner.nextLine();
        System.out.println("Nhập chức vụ: ");
        String level= scanner.nextLine();
        System.out.println("Nhập vị trí: ");
        String position= scanner.nextLine();
        System.out.println("Nhập lương: ");
        int salary= scanner.nextInt();
        Employee employee = new Employee(id,name,dateOfbirth,gender,cmnd,phone,email,level,position,salary);
        employeeList.add(employee);
        ReadAndWrite.write(employeeList,"C:\\Users\\Admin\\IdeaProjects\\Furama\\src\\data\\employee.csv");
    }

    @Override
    public void edit() {
        System.out.println("Nhập id cần sửa: ");
        int id= Integer.parseInt(scanner.nextLine());
        int size =employeeList.size();
        for(int i=0;i<size;i++)
        {
            if(employeeList.get(i).getId()==id)
            {
                System.out.println("Nhập tên: ");
                String name= scanner.nextLine();
                System.out.println("Nhập ngày sinh: ");
                String dateOfbirth= RegexData.regexAge(scanner.nextLine(),BIRTHDAY_REGEX);
                System.out.println("Nhập giới tính: ");
                String gender= scanner.nextLine();
                System.out.println("Nhập cmnd: ");
                int cmnd= Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập số điện thoại: ");
                String phone= scanner.nextLine();
                System.out.println("Nhập email: ");
                String email= scanner.nextLine();
                System.out.println("Nhập chức vụ: ");
                String level= scanner.nextLine();
                System.out.println("Nhập vị trí: ");
                String position= scanner.nextLine();
                System.out.println("Nhập lương: ");
                int salary= Integer.parseInt(scanner.nextLine());
                employeeList.get(i).setName(name);
                employeeList.get(i).setDateOfbirth(dateOfbirth);
                employeeList.get(i).setGender(gender);
                employeeList.get(i).setCmnd(cmnd);
                employeeList.get(i).setPhone(phone);
                employeeList.get(i).setEmail(email);
                employeeList.get(i).setLevel(level);
                employeeList.get(i).setPosition(position);
                employeeList.get(i).setSalary(salary);

            }
        }
    }

    @Override
    public void delete() {

    }
}
