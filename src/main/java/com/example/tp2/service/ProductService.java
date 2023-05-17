package com.example.tp2.service;

import com.example.tp2.model.produit.Product;
import com.example.tp2.repository.AdminRepository;
import com.example.tp2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService  {
    @Autowired
    ProductRepository productRepository;

    public List<Product> fetchAll() {
        return productRepository.findAll();
    }

    public Product fetchById(int id) {
        return productRepository.findById(id).get();
    }

    public void save(Product client) {
        productRepository.save(client);
    }

    public void delete(int id){
        productRepository.deleteById(id);
    }
}
