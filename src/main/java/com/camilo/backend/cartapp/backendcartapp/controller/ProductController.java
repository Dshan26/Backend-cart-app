package com.camilo.backend.cartapp.backendcartapp.controller;

import com.camilo.backend.cartapp.backendcartapp.models.entities.Product;
import com.camilo.backend.cartapp.backendcartapp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> lis() {
        return service.findAll();
    }

}
