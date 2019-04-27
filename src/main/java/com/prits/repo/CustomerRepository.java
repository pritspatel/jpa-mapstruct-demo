package com.prits.repo;

import com.prits.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by priteshpatel on 4/27/19.
 */
@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
