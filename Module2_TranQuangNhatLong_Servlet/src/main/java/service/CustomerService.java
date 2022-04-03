package service;

import model.Customer;
import model.Person;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomerList();
    public void addCustomer(Customer customer);
    public int getIdMax();
}
