package com.xworkz.train.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BatCostComponent {

    @Autowired
    private  double batCost;

    public BatCostComponent()
    {
        System.out.println("running in batCost");
    }
}
