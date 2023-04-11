package com.jsp.hibernate.service;

import com.jsp.hibernate.dao.CustomerDao;
import com.jsp.hibernate.dto.Customer;

public class CustomerService {
	CustomerDao customerDao=new CustomerDao();
	public Customer saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}
	public Customer deleteCustomer(int id) {
		return customerDao.deleteCustomer(id);
	}
	public void getAllCustomers() {
		customerDao.getAllCustomers();
	}
	public void getByIdCustomer(int id) {
		customerDao.getByIdCustomer(id);
	}

}
