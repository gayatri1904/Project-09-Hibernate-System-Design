package com.jsp.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate.dto.Product;

public class ProductDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gayatri");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Product saveProduct(Product product) {
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		return product;

	}

	public Product deleteProduct(int id) {
		Product product = entityManager.find(Product.class, id);
		entityTransaction.begin();
		entityManager.remove(product);
		entityTransaction.commit();
		return product;
	}

	public Product updateProduct(int id) {
		Product product = entityManager.find(Product.class, id);
		entityTransaction.begin();
		entityManager.merge(product);
		entityTransaction.commit();
		return product;

	}

	public void getAllProducts() {
		String sql = "select s from Product s";
		Query query = entityManager.createQuery(sql);
		List<Product> products= query.getResultList();
			for (Product product : products) {
				System.out.println(product.getId());
				System.out.println(product.getName());
				System.out.println(product.getPrice());
				System.out.println("==================");
			}
	}
	public void getByIdProduct(int id) {
		Product product= entityManager.find(Product.class, id);
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
	
		
	}

}
