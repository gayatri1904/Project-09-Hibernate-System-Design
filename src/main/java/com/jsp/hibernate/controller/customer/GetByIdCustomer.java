package com.jsp.hibernate.controller.customer;

import com.jsp.hibernate.service.CustomerService;

public class GetByIdCustomer {

	public static void main(String[] args) {
		CustomerService customerService=new CustomerService();
		customerService.getByIdCustomer(4);

	}

}
