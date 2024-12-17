package com.xworkz.train.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class IplComponent {
@Autowired
private  String teamName;

@Autowired
private double budget;

@Autowired
private String ownerName;

@Autowired
private double batCost;

@Autowired
private double ballCost;

    public IplComponent()
    {
        System.out.println("creating iplcomponent");
    }



}
