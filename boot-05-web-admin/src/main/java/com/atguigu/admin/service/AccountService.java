package com.atguigu.admin.service;

import com.atguigu.admin.bean.Account;
import com.atguigu.admin.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AccountService
 *
 * @author fj
 * @date 2022/9/28 22:52
 */
@Service
public class AccountService {
    @Autowired()
    private AccountMapper accountMapper;
    public Account getAcctById(Long id){
        Account acct = accountMapper.getAcct(id);
        return acct;
    }
}
