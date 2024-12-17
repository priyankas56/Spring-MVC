package com.xworkz.train.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BallCost{
@Autowired
private double ballCost;
    public BallCost()
    {
        System.out.println("running in ballCost");
    }
}
