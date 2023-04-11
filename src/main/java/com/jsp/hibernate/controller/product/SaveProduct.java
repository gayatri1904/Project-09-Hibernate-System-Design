package com.jsp.hibernate.controller.product;

import com.jsp.hibernate.dto.Product;
import com.jsp.hibernate.service.ProductService;

public class SaveProduct {

	public static void main(String[] args) {
		Product product=new Product();
		product.setName("pendrive");
		product.setPrice(500);
		
		ProductService productService=new ProductService();
		Product product2= productService.saveProduct(product);
			if(product2!=null) {
				System.out.println("Product has been added");
			}
	}

}
