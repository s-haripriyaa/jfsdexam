package com.bezkoder.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.datajpa.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	List<Customer> findByPublished(boolean published);
	List<Customer> findByTitleContaining(String title);
}
