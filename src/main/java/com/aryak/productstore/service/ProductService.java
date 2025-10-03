package com.aryak.productstore.service;

import com.aryak.productstore.model.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> getProducts();
}