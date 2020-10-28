package com.HR.HRApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {


    @RequestMapping("/Home")
    public String getAccounts(Model model){
        return "list";
    }
}
