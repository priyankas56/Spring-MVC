package com.xworkx.mall.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ICC implements BCCI{

@Value("${username}")
private String username;


@Value("${password}")
private String password;

@Value("${email}")
private String email;


    @Value("${address}")
private String address;


@PostConstruct
public void postCreation(){
    System.out.println("username:" +this.username);
    System.out.println("password:" +this.password);
    System.out.println("email:" +this.email);
    System.out.println("address:" +this.address);
}

    public ICC(){
        System.out.println("creating no arg const for ICC");

    }
    @Override
    public int noOfPlayers() {
        return 11;
    }



}
