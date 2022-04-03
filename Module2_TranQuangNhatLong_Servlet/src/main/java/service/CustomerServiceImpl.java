package service;

import model.Customer;
import reposity.CustomerReposity;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    CustomerReposity customerReposity = new CustomerReposity();
    @Override
    public List<Customer> getCustomerList() {
        return customerReposity.getCustomerList();
    }

    @Override
    public void addCustomer(Customer customer) {
        customerReposity.addCustomer(customer);
    }

    @Override
    public int getIdMax() {
        return customerReposity.getIdMax();
    }
}
