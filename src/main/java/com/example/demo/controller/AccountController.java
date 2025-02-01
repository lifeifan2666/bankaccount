package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/*
   @auther：liff
   @date：2025/2/1 - 10:36
   @desc:
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public BigDecimal getAccountBalance(@PathVariable long id) {
        return userService.getBalanceById(id);
    }
}
