package com.aero.aeroparker_muneeb.controller;

import com.aero.aeroparker_muneeb.model.Customers;
import com.aero.aeroparker_muneeb.repo.aeroparker_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/register")
public class aeroparker_controller {

    @Autowired
    private aeroparker_repo repo;

    @PostMapping
    public String Register(@RequestBody Customers customer){

    try{
        repo.save(customer);
    }

    catch (Exception e){
        e.printStackTrace();
    }

        return "Registered";
    }

}
