package com.aryak.productstore.service.impl;

import com.aryak.productstore.model.Product;
import com.aryak.productstore.model.ProductDto;
import com.aryak.productstore.repository.ProductRepository;
import com.aryak.productstore.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDto> getProducts() {
        log.info("Entering getProducts()");
        return productRepository.findAll()
                .stream()
                .map(this::toProductDto)
                .toList();

    }

    private ProductDto toProductDto(Product product) {
        final ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }
}
