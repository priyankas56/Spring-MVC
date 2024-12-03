package com.xworkz.metroStation.congiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.metroStation")
public class MetroStationConfigur {

    public MetroStationConfigur(){

        System.out.println("creating MetroStationConfigur");
    }
}
