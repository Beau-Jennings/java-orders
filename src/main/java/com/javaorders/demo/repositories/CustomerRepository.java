package com.javaorders.demo.repositories;

import com.javaorders.demo.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>
{
}
