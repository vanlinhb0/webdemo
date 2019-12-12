package com.dsvn.webdemo.controller;

import com.dsvn.webdemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts")
    public String getListAccount(HttpServletRequest request, Model model) {
        model.addAttribute("listAccount", accountService.findAll());
        return "listAccount";
    }

}
