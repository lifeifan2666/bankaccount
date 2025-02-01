package com.example.demo.service;

import com.example.demo.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/*
   @auther：liff
   @date：2025/2/1 - 10:56
   @desc:
 */
@Service
public class UserService {
    @Autowired
    AccountMapper accountMapper;
    public BigDecimal getBalanceById(long id){
        return accountMapper.findById(id).getBalance();
    }
}
