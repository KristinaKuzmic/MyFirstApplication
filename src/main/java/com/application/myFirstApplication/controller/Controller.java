package com.application.myFirstApplication.controller;

import com.application.myFirstApplication.model.Director;
import com.application.myFirstApplication.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/application")
@CrossOrigin

public class Controller {

    @Autowired
    private ServiceInterface serviceInterface;

    @GetMapping("/login")
    public Director getDirector() {
        return null;
    }

}
