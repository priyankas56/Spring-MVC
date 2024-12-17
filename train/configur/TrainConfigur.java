package com.xworkz.train.configur;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.train.component")
public class TrainConfigur {

    public TrainConfigur()
    {
        System.out.println("creating trainconfiguration");
    }
    @Bean
    public String TeamName(){
        String teamName = new String("rcb team");
        System.out.println("creating TeamName");
        return teamName;
    }
    @Bean
    public double budget(){
        System.out.println("creating budget");
        double budget=500000;
        return budget;
    }
    @Bean
    public String ownerName()
    {
        System.out.println("creating ownerName");
        String ownerName=new String("sahil");
        return ownerName;
    }
    @Bean
    public double batCost()
    {
        System.out.println("creating batCost");
        double batCost=10000;
        return batCost;
    }
    @Bean
    public double ballCost(){
        System.out.println("creating ballCost");
        double ballCost=500;
        return ballCost;
    }
}
