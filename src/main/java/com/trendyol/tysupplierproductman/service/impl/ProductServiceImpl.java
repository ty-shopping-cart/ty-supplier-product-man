package com.trendyol.tysupplierproductman.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trendyol.tysupplierproductman.dto.ProductDto;
import com.trendyol.tysupplierproductman.dto.UpdateProductDto;
import com.trendyol.tysupplierproductman.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private KafkaTemplate<String, Object> kafkaTemplate;

    private static final String CREATE_PRODUCT_TOPIC = "AddedProductBySupplier";

    private static final String UPDATE_PRODUCT_TOPIC = "UpdatedProductBySupplier";

    @Autowired
    public ProductServiceImpl(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public String createProduct(ProductDto productDto) throws JsonProcessingException {

        kafkaTemplate.send(CREATE_PRODUCT_TOPIC,productDto);
        return "product created";
    }

    @Override
    public String updateProduct(UpdateProductDto updateProductDto) {

        kafkaTemplate.send(UPDATE_PRODUCT_TOPIC,updateProductDto);
        return "product updated";
    }
}
