package com.xworkz.product.service;

import com.xworkz.product.dto.ProductDTO;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements  ProductService{
    @Override
    public boolean validate(ProductDTO productDTO) {
        System.out.println("running in validate ProductServiceImpl");
        return true;
    }
}
