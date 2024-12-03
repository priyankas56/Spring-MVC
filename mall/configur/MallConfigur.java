package com.xworkx.mall.configur;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.xworkx.mall.component")
@PropertySource("classpath:app.properties")
public class MallConfigur {

    public MallConfigur(){
        System.out.println("creating MallConfigur");
    }
@Bean
    public String name(){
        System.out.println("creating name");
        return "priya";
    }

@Bean
    public String anything(){
        System.out.println("creating anything");
        return "priyanka";
    }
@Bean
    public int age(){
        System.out.println("creating age");
        return 21;
    }

}
