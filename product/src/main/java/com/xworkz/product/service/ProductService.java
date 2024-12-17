package com.xworkz.product.service;

import com.xworkz.product.dto.ProductDTO;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    boolean validate(ProductDTO productDTO);

}
