package com.xworkz.product.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class ProductDTO {

    private  String name;
    private  String type;
    private  String cost;
    private  String manufacture;
   @DateTimeFormat(pattern = "dd-MM-yyyy")
    private  LocalDate manfDate;
    private  String warranty;

}
