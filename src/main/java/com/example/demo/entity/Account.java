package com.example.demo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;
import java.sql.Time;

/*
   @auther：liff
   @date：2025/2/1 - 11:43
   @desc:
 */
@Data
public class Account {
    private Long id;
    private String name;
    private BigDecimal balance;
    private String phone;
    private Time create_time;
    private Time update_time;
    public BigDecimal getBalance(){
        return balance;
    }
}
