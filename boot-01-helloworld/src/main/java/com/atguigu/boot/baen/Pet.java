package com.atguigu.boot.baen;

import lombok.*;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/18 22:36    since 1.0.0
 */
@Data()
@ToString()
@AllArgsConstructor()//有参构造器
@NoArgsConstructor()//无参构造器
@EqualsAndHashCode()//重写
public class Pet {
    private String name;

}
