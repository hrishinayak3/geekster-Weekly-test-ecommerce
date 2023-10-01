package com.geekster.Ecommerce.API.Creation.service;

import com.geekster.Ecommerce.API.Creation.model.Product;
import com.geekster.Ecommerce.API.Creation.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepo.findByCategory(category);
    }

    public void deleteProductById(Integer productId) {
        productRepo.deleteById(productId);
    }
}