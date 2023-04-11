package com.jsp.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate.dto.Customer;
import com.jsp.hibernate.dto.Product;

public class CustomerDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gayatri");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Customer saveCustomer(Customer customer) {
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
		return customer;
		
	}
	public Customer deleteCustomer(int id) {
		Customer customer= entityManager.find(Customer.class, id);
		entityTransaction.begin();
		entityManager.remove(customer);
		entityTransaction.commit();
		return customer;
	}
	public void getAllCustomers() {
		String sql="select s from Customer s";
		Query query= entityManager.createQuery(sql);
		List<Customer> customers= query.getResultList();
		for (Customer customer : customers) {
			System.out.println(customer.getId());
			System.out.println(customer.getName());
			System.out.println(customer.getAge());
			System.out.println("=======================");
		}
	}
	public void getByIdCustomer(int id) {
		Customer customer= entityManager.find(Customer.class, id);
		System.out.println(customer.getId());
		System.out.println(customer.getName());
		System.out.println(customer.getAge());
	
		
	}

	

}
