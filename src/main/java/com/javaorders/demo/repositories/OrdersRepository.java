package com.javaorders.demo.repositories;

import com.javaorders.demo.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Order, Long>
{
}
