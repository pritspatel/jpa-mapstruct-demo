package com.prits;

import com.prits.entity.Customer;
import com.prits.entity.Post;
import com.prits.entity.Tag;
import com.prits.repo.CustomerRepository;
import com.prits.repo.PostRepository;
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

	@Autowired
	private PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaMapstructDemoApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		log.info("Application started. Loading data..");
		Customer c1 = new Customer(null, "Pritesh", "Patel");
		Customer c2 = new Customer(null, "Jon","Doe");
		Customer c3 = new Customer(null, "Jane","Doe");
		List<Customer> customers = Arrays.asList(c1, c2, c3);
		repository.saveAll(customers);

		//create tags

		Tag t1 = new Tag();
		t1.setName("tag1");

		Tag t2 = new Tag();
		t2.setName("tag2");

		Tag t3 = new Tag();
		t3.setName("tag3");

		List<Tag> tags1 = Arrays.asList(t1, t2);
		List<Tag> tags2 = Arrays.asList(t2, t3);

		//set post 1
		Post p1 = new Post();
		p1.setTitle("Title 1 of post 1");
		//p1.setTags(tags1);
		p1.getTags().add(t1);
		p1.getTags().add(t2);

		//set post 2
		Post p2 = new Post();
		p2.setTitle("Title 2 of post 2");
		p2.getTags().add(t1);
		//p2.getTags().add(t3);

		postRepository.save(p1);
		//postRepository.save(p2);

		log.info("Data Loaded successfully!!!");
	}
}
