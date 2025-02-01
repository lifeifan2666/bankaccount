package com.example.demo.mapper;

import com.example.demo.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/*
   @auther：liff
   @date：2025/2/1 - 11:44
   @desc:
 */
@Mapper
public interface AccountMapper {
    @Select("SELECT * FROM account WHERE id = #{id}")
    Account findById(long id);
}
