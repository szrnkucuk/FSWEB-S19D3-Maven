package com.workintech.s19d2.controller;


import com.workintech.s19d2.entity.Account;
import com.workintech.s19d2.service.AccountService;
import com.workintech.s19d2.service.AccountServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/account")
public class AccountController {
    private final AccountService accountService;

    @GetMapping
    public List<Account> findAll(){
        return accountService.findAll();
    }

    @PostMapping
    public Account save(Account account){
        return  accountService.save(account);
    }
}
