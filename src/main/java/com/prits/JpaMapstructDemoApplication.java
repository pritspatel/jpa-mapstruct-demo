package com.prits;

import com.prits.entity.Customer;
import com.prits.repo.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Slf4j
public class JpaMapstructDemoApplication implements CommandLineRunner{

	@Autowired
	private CustomerRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(JpaMapstructDemoApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		log.info("Application started. Loading data..");
		Customer c1 = new Customer(null, "Pritesh","Patel");
		Customer c2 = new Customer(null, "Jon","Doe");
		Customer c3 = new Customer(null, "Jane","Doe");
		List<Customer> customers = Arrays.asList(c1, c2, c3);
		repository.saveAll(customers);
		log.info("Data Loaded successfully!!!");
	}
}
