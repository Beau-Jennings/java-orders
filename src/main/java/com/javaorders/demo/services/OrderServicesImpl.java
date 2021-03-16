package com.javaorders.demo.services;

import com.javaorders.demo.models.Order;
import com.javaorders.demo.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class OrderServicesImpl implements OrderServices
{
    @Autowired
    private OrdersRepository ordersRepository;

    @Transactional
    @Override
    public Order save(Order order)
    {
        return ordersRepository.save(order);
    }
}
