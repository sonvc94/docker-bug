package com.java.demo.supremetech.controller;

import com.java.demo.supremetech.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloDocker {
    @Autowired
    private Service service;
    @GetMapping("/")
    public String Home(ModelMap modelMap) {
        modelMap.addAttribute("user",service.findById(1));
        return "index";
    }
}
