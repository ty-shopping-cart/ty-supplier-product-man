package com.trendyol.tysupplierproductman.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateProductDto {
    private Integer productId;
    private String title;
    private Double price;
    private String imageURL;
    private String barcode;
    private Integer stock;
    private Integer categoryId;
}
