package com.lambdaschool.orders.controllers;

import com.lambdaschool.orders.models.Customer;
import com.lambdaschool.orders.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class AgentController
{
    @Autowired
    private CustomerServices customerServices;

    @GetMapping(value = "/orders", produces = {"application/json"})
    public ResponseEntity<?> listAllCustomers()
    {
        List<Customer> myCustomers = customerServices.findAllCustomers();
        return new ResponseEntity<>(myCustomers, HttpStatus.OK);
    }

    @GetMapping (value ="/customer/{custid}", produces = {"application/json"})
    public ResponseEntity<?> getCustomerById(
            @PathVariable long custid)
    {
        Customer c = customerServices.findCustomersById(custid);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    @GetMapping(value = "namelike/{custname}", produces = {"application/json"})
    public ResponseEntity<?> findCustomerByName(
            @PathVariable String custname)
    {
        List<Customer> myCustomerList = customerService.findbyCustomerName(custname);
        return new ResponseEntity<>(myCustomerList, HttpStatus.OK);
    }
}