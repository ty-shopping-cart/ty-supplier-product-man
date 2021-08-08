package com.trendyol.tysupplierproductman.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.trendyol.tysupplierproductman.dto.ProductDto;
import com.trendyol.tysupplierproductman.dto.UpdateProductDto;
import com.trendyol.tysupplierproductman.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/")
    public ResponseEntity<String> createProduct (@RequestBody ProductDto productDto) throws JsonProcessingException {
        return ResponseEntity.ok(productService.createProduct(productDto));
    }

    @PutMapping("/")
    public ResponseEntity<String> updateProduct (@RequestBody UpdateProductDto productDto) throws JsonProcessingException {
        return ResponseEntity.ok(productService.updateProduct(productDto));
    }
}
