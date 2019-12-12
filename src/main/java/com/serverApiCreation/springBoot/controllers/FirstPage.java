package com.serverApiCreation.springBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstPage {
    @RequestMapping("/")
    String index(){
        return "firstPage";
    }
}
