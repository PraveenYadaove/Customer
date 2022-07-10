package com.cts.bank.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cts.bank.model.Customer;
import com.cts.bank.repo.Customerrepo;
@Service
public class Customerimpl implements Customerservice{
	@Autowired
    private Customerrepo adminRepository;
	public List<Customer> getAllCust()
	{
		List<Customer> books = new ArrayList<Customer>();  
    	adminRepository.findAll().forEach(books1 -> books.add(books1));  
    	return books; 
	}
	@Override
	 public void saveOrUpdate(Customer cus)
	 {
		 adminRepository.save(cus);
	 }
	 @Override
	 public Customer login(int cid, String passwords) {
		 Customer user = adminRepository.findByCidAndPasswords(cid, passwords);
	  	   return user;
	 }
	 @Override
	 public String getBalance(Customer student){
		  
	    	String r="";
	    	for(Customer x:adminRepository.findAll())
	    	{
	    		if(x.getCid()==student.getCid())
	    		{
	    			r=""+x.getCbalance();
	    		}
	    	}
	    	return r;
	 }
}
