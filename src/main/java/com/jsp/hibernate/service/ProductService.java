package com.jsp.hibernate.service;

import com.jsp.hibernate.dao.ProductDao;
import com.jsp.hibernate.dto.Product;

public class ProductService {
	ProductDao productDao=new ProductDao();
	
	public Product saveProduct(Product product) {
		 return productDao.saveProduct(product);
	}
	public Product deleteProduct(int id) {
		return productDao.deleteProduct(id);
	}
	public Product updateProduct(int id) {
		return productDao.updateProduct(id);
	}
	public void getAllProducts() {
		productDao.getAllProducts();
	}
	public void getByIdProduct(int id) {
		productDao.getByIdProduct(id);
	}

}
