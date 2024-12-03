package com.xworkz.metroStation.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class MetroStationComponent {
    public MetroStationComponent(){
        System.out.println("creating MetroStationComponent");
    }
@RequestMapping("/save")
    public  String onSave(){

        System.out.println("running onSave in MetroStationComponent");
        return "index.jsp";
    }
}
