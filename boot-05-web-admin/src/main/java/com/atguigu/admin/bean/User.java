package com.atguigu.admin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

/**
 * User
 *
 * @author fj
 * @date 2022/9/22 13:25
 */
@Data
@AllArgsConstructor //包含所有参数的构造函数
public class User {
    private String username;
    private String password;
    private Integer age;
    private String sex;
    private String email;
}
