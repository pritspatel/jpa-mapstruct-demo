package com.prits.service;

import com.prits.dto.CustomerDto;
import com.prits.entity.Customer;
import com.prits.mapper.CustomerMapper;
import com.prits.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by priteshpatel on 4/27/19.
 */
@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<CustomerDto> findAllCustomers(){
        Iterable<Customer> customers = customerRepository.findAll();
        List<CustomerDto> customerDtoList = CustomerMapper.INSTANCE.entityListToDtoList((List<Customer>) customers);
        return customerDtoList;
    }
}
