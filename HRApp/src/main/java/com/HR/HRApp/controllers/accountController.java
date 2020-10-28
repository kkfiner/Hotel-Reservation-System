package com.HR.HRApp.controllers;

import com.HR.HRApp.repositories.accountRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class accountController {

    private final accountRepository accountRepository;

    public accountController(accountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @RequestMapping("/Accounts")
    public String getAccounts(Model model){

        model.addAttribute("Accounts", accountRepository.findAll());
        return "Accounts/list";
    }
}
