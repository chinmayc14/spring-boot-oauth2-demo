package com.example.producer1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class controller {
    List<Product> list = new ArrayList<>(
            Arrays.asList(new Product(1,"name",98),new Product(2,"name",98))
    );
    @RequestMapping("/hello")
    public String getHello(){
        return "hello world";
    }

    @GetMapping("/getProducts/")
    public List<Product> getAllProducts(){

        return list;


    }

    @GetMapping("/getProducts/{id}")
        public Product getItem(@PathVariable  int id){
        return list.get(id-1);
        }
}
