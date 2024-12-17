package com.xworkz.train.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BudgetComponent {
@Autowired
    private double budget;
    public BudgetComponent(){
        System.out.println("running in budget");
    }
}
