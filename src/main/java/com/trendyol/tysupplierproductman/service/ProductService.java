package com.trendyol.tysupplierproductman.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.trendyol.tysupplierproductman.dto.ProductDto;
import com.trendyol.tysupplierproductman.dto.UpdateProductDto;

public interface ProductService {
    String createProduct(ProductDto productDto) throws JsonProcessingException;

    String updateProduct(UpdateProductDto updateProductDto) throws JsonProcessingException;
}
