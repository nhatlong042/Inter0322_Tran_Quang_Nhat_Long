package controller;

import model.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {

    private CustomerService customerService = new CustomerServiceImpl();

    public void getListCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = customerService.getCustomerList();
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("/person/list.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                addCustomer(request, response);
                break;
            default:
                getListCustomer(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                request.getRequestDispatcher("/person/addCustomer.jsp").forward(request, response);
                break;
            default:
                getListCustomer(request, response);
                break;
        }
    }

    public void addCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = customerService.getIdMax() + 1;
        System.out.println(id);
        String name = request.getParameter("name");
        String dateOfBirth =request.getParameter("dateOfBirth");
        String gender =request.getParameter("gender");
        int cmnd =Integer.parseInt(request.getParameter("cmnd"));
        String phone =request.getParameter("phone");
        String email =request.getParameter("email");
        String type =request.getParameter("type");
        String address =request.getParameter("address");
        Customer customer = new Customer(id,name, dateOfBirth,gender,cmnd,phone,email,type,address);
        customerService.addCustomer(customer);
        request.setAttribute("message" , "Thêm thành công!");
        getListCustomer(request,response);
    }
}
