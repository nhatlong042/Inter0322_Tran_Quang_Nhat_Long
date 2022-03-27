package controller;

import services.FacilityService;
import services.Impl.CustomerServiceImpl;
import services.Impl.EmployeeServiceImpl;
import services.Impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){
        boolean check= true;
        int choice=0;
        while(check){
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
             System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            Scanner scanner= new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại: ");
            }
            switch (choice){
                case 1:{
                    displayEmployeeMenu();
                    break;
                }
                case 2:{
                    displayCustomerMenu();
                    break;
                }
                case 3:{
                    displayFacilityMenu();;
                    break;
                }
                case 4:{
                    displayBookingMenu();
                    break;
                }
                case 5: {
                    displayPromotionMenu();
                    break;
                }
                case 6:{
                    return;
                }
            }
        }
    }
    public static void displayEmployeeMenu(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        boolean check= true;
        int choice=0;
        while(check){
            System.out.println("1. Display list employee");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            Scanner scanner= new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại: ");
            }
            switch (choice){
                case 1:{
                    employeeService.display();
                    break;
                }
                case 2:{
                    employeeService.addNew();
                    break;
                }
                case 3:{
                    employeeService.edit();
                    break;
                }
                case 4:{
                    displayMainMenu();
                    break;
                }
            }
        }
    }
    public static void displayCustomerMenu(){
        CustomerServiceImpl customerService= new CustomerServiceImpl();
        boolean check= true;
        int choice=0;
        while(check){
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            Scanner scanner= new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại: ");
            }
            switch (choice){
                case 1:{
                    customerService.display();
                    break;
                }
                case 2:{
                    customerService.addNew();
                    break;
                }
                case 3:{

                }
                case 4:{
                    displayMainMenu();
                    break;
                }
            }
        }
    }
    public static void displayFacilityMenu(){
        FacilityServiceImpl facilityService= new FacilityServiceImpl();
        boolean check= true;
        int choice=0;
        while(check){
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintain");
            System.out.println("4. Return main menu");
            Scanner scanner= new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại: ");
            }
            switch (choice){
                case 1:{
                    facilityService.display();
                    break;
                }
                case 2:{
                    addNewFacilityMenu();
                    break;
                }
                case 3:{

                }
                case 4:{
                    displayMainMenu();
                    break;
                }
            }
        }
    }
    public static void addNewFacilityMenu(){
        FacilityServiceImpl facilityService= new FacilityServiceImpl();
        boolean check= true;
        int choice=0;
        while(check){
            System.out.println("1. Add new Villa");
            System.out.println("2. Add new House");
            System.out.println("3. Add new Room");
            System.out.println("4. Return main menu");
            Scanner scanner= new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại: ");
            }
            switch (choice){
                case 1:{
                    facilityService.addNewVilla();
                    displayFacilityMenu();
                    break;
                }
                case 2:{

                    break;
                }
                case 3:{

                }
                case 4:{
                    displayMainMenu();
                    break;
                }
            }
        }
    }
    public static void displayBookingMenu(){
        boolean check= true;
        int choice=0;
        while(check){
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            Scanner scanner= new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại: ");
            }
            switch (choice){
                case 1:{

                }
                case 2:{

                }
                case 3:{

                }
                case 4:{

                }
                case 5:{

                }
                case 6:{
                    displayMainMenu();
                    break;
                }
            }
        }
    }
    public static void displayPromotionMenu(){
        boolean check= true;
        int choice=0;
        while(check){
            System.out.println("1. Display list customer use service");
            System.out.println("2. Display list customer get voucher");
            System.out.println("3. Return main menu");
            Scanner scanner= new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại: ");
            }
            switch (choice){
                case 1:{

                }
                case 2:{

                }
                case 3:{
                    displayMainMenu();
                    break;
                }
            }
        }
    }
}
