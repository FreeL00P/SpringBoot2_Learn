package com.atguigu.admin.mapper;

import com.atguigu.admin.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * UserMapper
 *
 * @author fj
 * @date 2022/9/29 12:24
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
