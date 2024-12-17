package com.xworkz.product.controller;

import com.xworkz.product.dto.ProductDTO;
import com.xworkz.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.font.EAttribute;

import javax.xml.ws.soap.Addressing;

@Controller
@RequestMapping("/")
public class ProductController {
    @Autowired
    private ProductService productService;

    public ProductController(){
        System.out.println("creating ProductController");
    }
    @PostMapping("/press")
    public String onPress(){
        System.out.println("running in onPress ProductController");
return "index.jsp";
    }
    @PostMapping("/product")
    public  String onProduct(ProductDTO productDTO, Model model){
        System.out.println("running in onProduct public class ProductController ");
        System.out.println("productDTO:"+productDTO);
     boolean save=   this.productService.validate(productDTO);
     if(save){
         System.out.println("product details saved successfully");
         model.addAttribute("message","product deatails saved successfully");
         model.addAttribute("Productdto",productDTO);
     }else{
         System.out.println("data not saved");
         model.addAttribute("message","error saving product");
         model.addAttribute("Productdto",productDTO);
     }
        return "product.jsp";
    }
}
