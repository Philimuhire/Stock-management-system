package com.mycompany.stockmanagement.service;

import com.mycompany.stockmanagement.entities.CUSTOMER;
import com.mycompany.stockmanagement.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CUSTOMER> getAllCustomers() {
        return customerRepository.findAll();
    }
    
    public int getTotalCustomers() {
        List<CUSTOMER> allCustomers = getAllCustomers();
        return allCustomers.size();
    }

    public CUSTOMER getCustomerById(int customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }

    public CUSTOMER createCustomer(CUSTOMER customer) {
        return customerRepository.save(customer);
    }

    public CUSTOMER updateCustomer(int customerId, CUSTOMER updatedCustomer) {
        if (customerRepository.existsById(customerId)) {
            updatedCustomer.setCustomerID(customerId);
            return customerRepository.save(updatedCustomer);
        } else {
            return null;
        }
    }

    public boolean deleteCustomer(int customerId) {
        if (customerRepository.existsById(customerId)) {
            customerRepository.deleteById(customerId);
            return true;
        } else {
            return false;
        }
    }
}
