package com.javaorders.demo.services;

import com.javaorders.demo.models.Payment;
import com.javaorders.demo.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class PaymentServicesImpl implements PaymentServices
{
    @Autowired
    private PaymentRepository paymentRepository;

    @Transactional
    @Override
    public Payment save(Payment payment)
    {
        return paymentRepository.save(payment);
    }

}


