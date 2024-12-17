package com.xworkz.train.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OwnerNameComponenent {
@Autowired
    private String ownerName;

    public OwnerNameComponenent(){
        System.out.println("running in ownerName");
    }
}
