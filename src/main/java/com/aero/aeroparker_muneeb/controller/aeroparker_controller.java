package com.aero.aeroparker_muneeb.controller;

import com.aero.aeroparker_muneeb.repo.aeroparker_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin
@RequestMapping("/register")
public class aeroparker_controller {

    @Autowired
    private aeroparker_repo repo;


}
