package com.xworkz.smartphone.configur;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
@ComponentScan("com.xworkz.smartphone.configur")
public class StringConfigurBuilder {


    public  StringConfigurBuilder() {
        System.out.println("creating configuration StringConfigurBuilder");
    }
}