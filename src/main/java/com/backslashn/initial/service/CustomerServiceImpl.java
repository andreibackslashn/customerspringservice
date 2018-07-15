package com.backslashn.initial.service;

import com.backslashn.initial.model.Customer;
import com.backslashn.initial.repository.CustomerRepository;
import com.backslashn.initial.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public  class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
