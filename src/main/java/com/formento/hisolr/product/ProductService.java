package com.formento.hisolr.product;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public Product create(final Product product) {
		// put some logic, validation...
		return productRepository.save(product);
	}

}
