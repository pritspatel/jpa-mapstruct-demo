package com.prits.service;

import com.prits.dto.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by priteshpatel on 4/27/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CustomerServiceTest {

    @Autowired
    CustomerService customerService;


    @Test
    public void findAllCustomers() throws Exception {
        List<CustomerDto> allCustomers = customerService.findAllCustomers();
        Assert.assertNotNull(allCustomers);
        Assert.assertTrue(allCustomers.size() == 3);
        log.info("Customer list:{}",allCustomers);
    }

}