package service;

import java.util.List;

import model.Product;

public interface ProductService {
	
	Product createProduct(Product product);
	
	Product updateProduct(Product product);
	
	List<Product> getAllProduct();
	
	Product getProdctById(long productId);
	
	void deleteproduct(long id);
	

}
