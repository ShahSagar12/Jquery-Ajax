package com.sagar.aj.dao;

import java.util.ArrayList;
import java.util.List;

import com.sagar.aj.entity.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public List<Customer> getAll() {
		List<Customer> list=new ArrayList<>();
		list.add(new Customer(1,"Sagar","sagar@gmail.com",true));
		list.add(new Customer(2,"Sabin","sabin@gmail.com",true));
		list.add(new Customer(3,"Sabina","sabina@gmail.com",true));
		return list;
	}

	@Override
	public Customer getById(int id) {
		for(Customer customer:getAll()) {
			if(customer.getId()==id) {
				return customer;
			}
		}
		return null;
	}

}
