package com.javaorders.demo.repositories;

import com.javaorders.demo.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long>
{
}