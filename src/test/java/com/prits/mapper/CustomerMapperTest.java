package com.prits.mapper;

import com.prits.dto.CustomerDto;
import com.prits.entity.Customer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by priteshpatel on 4/27/19.
 */
public class CustomerMapperTest {
    @Test
    public void entityToDto() throws Exception {
        //given
        Customer c1 = new Customer(1L,"Test1","Test2");

        //when
        CustomerDto customerDto = CustomerMapper.INSTANCE.entityToDto(c1);

        //validate
        Assert.assertNotNull(customerDto);
        Assert.assertTrue(customerDto.getId() == 1L);
    }

    @Test
    public void dtoToEntity() throws Exception {

    }

}