package com.jsp.hibernate.controller.customer;

import com.jsp.hibernate.dto.Customer;
import com.jsp.hibernate.service.CustomerService;

public class DeleteProduct {

	public static void main(String[] args) {
		CustomerService customerService=new CustomerService();
		Customer customer= customerService.deleteCustomer(5);
		if(customer!=null) {
			System.out.println("Customer has been remove from database");
		}

	}

}
