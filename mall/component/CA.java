package com.xworkx.mall.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CA implements BCCI{



    @Qualifier("anything")
    private String something;


    @Autowired
    @Qualifier("age")
    private int number;



    public CA(){
        System.out.println("no args constuctor of CA");
    }
    @Override
    public int noOfPlayers() {
        return 11;
    }
}
