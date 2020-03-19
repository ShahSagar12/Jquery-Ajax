package com.sagar.aj.dao;

import java.util.List;

import com.sagar.aj.entity.Customer;

public interface CustomerDAO {
	List<Customer> getAll();
	Customer getById(int id);

}
