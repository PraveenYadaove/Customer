package com.cts.bank.service;


import java.util.List;

import com.cts.bank.model.Customer;

public interface Customerservice {
	public List<Customer> getAllCust();
	 public void saveOrUpdate(Customer cus);
	 public Customer login(int cid, String passwords);
	 public String getBalance(Customer student);
}
