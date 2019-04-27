package com.prits.web;

import com.prits.dto.CustomerDto;
import com.prits.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by priteshpatel on 4/27/19.
 */
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/findAll")
    public List<CustomerDto> findAllCustomers(){
        List<CustomerDto> allCustomers = customerService.findAllCustomers();
        return allCustomers;
    }
}
