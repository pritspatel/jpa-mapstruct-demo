package com.prits.mapper;

import com.prits.dto.CustomerDto;
import com.prits.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by priteshpatel on 4/27/19.
 */
@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDto entityToDto(Customer customer);
    List<CustomerDto> entityListToDtoList(List<Customer> customers);
    Customer dtoToEntity(CustomerDto customerDto);
}
