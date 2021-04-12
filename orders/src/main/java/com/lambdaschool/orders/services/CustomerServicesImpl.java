package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Customer;
import com.lambdaschool.orders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class CustomerServicesImpl implements CustomerServices
{

    @Autowired
    private CustomersRepository customerRepository;

    @Transactional
    @Override
    public Customer save(Customer customer)
    {
        return customerRepository.save(customer);
    }
}
