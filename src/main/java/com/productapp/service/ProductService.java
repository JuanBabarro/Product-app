package com.productapp.service;

import com.productapp.model.Product;
import com.productapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Optional<Product> getProductByName(String name) {
        return productRepository.findByName(name);
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        try {
            Product product = productRepository.findById(id).orElseThrow();
            product.setName(updatedProduct.getName());
            product.setDescription(updatedProduct.getDescription());
            product.setPrice(updatedProduct.getPrice());
            product.setQuantity(updatedProduct.getQuantity());
            return productRepository.save(product);
        } catch (Exception e) {
            return null;
        }
    }

    public boolean deleteProduct(Long id) {
        try {
            productRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Product> getAllProductsOrderedByPrice() {
        return productRepository.findAllByOrderByPriceAsc();
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
