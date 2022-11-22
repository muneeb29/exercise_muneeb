package com.aero.aeroparker_muneeb.controller;

import com.aero.aeroparker_muneeb.model.Customers;
import com.aero.aeroparker_muneeb.repo.aeroparker_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@CrossOrigin

public class aeroparker_controller {

    @Autowired
    private aeroparker_repo repo;

    @GetMapping("/register")
    public String home(){
        return "index";
    }

    @GetMapping("/success")
    public String success(){
        return "success";
    }

    @PostMapping("/insert_customer")
    public String insert_customer(@RequestBody Customers customer){

    try{
        repo.save(customer);
    }

    catch (Exception e){
        e.printStackTrace();
    }

        return "success";
    }

}
