package com.xworkz.product.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.xworkz.product")
@Component
public class ProductConfigur {

    public ProductConfigur(){
        System.out.println("creating ProductConfigur");
    }
}
