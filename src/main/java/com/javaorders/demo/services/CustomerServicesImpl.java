package com.javaorders.demo.services;

import com.javaorders.demo.models.Customer;
import com.javaorders.demo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class CustomerServicesImpl implements CustomerServices
{
    @Autowired
    private CustomerRepository customerRepository;

    @Transactional
    @Override
    public Customer save(Customer customer)
    {
        return customerRepository.save(customer);
    }
}
