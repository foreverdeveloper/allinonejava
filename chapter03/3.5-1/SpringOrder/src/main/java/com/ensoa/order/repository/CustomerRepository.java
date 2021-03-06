package com.ensoa.order.repository;

import java.util.List;

import com.ensoa.order.entity.CustomerEntity;
import com.ensoa.order.entity.Pageable;

public interface CustomerRepository {
	CustomerEntity findOne(long id);
	List<CustomerEntity> findAll();
	List<CustomerEntity> findAll(Pageable page);
	void save(CustomerEntity customer);
	void delete(long id);
}
