package com.atguigu.admin.mapper;

import com.atguigu.admin.bean.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * AccountMapper
 *
 * @author fj
 * @date 2022/9/28 22:05
 */
@Mapper
public interface AccountMapper {
    Account getAcct(Long id);
}
