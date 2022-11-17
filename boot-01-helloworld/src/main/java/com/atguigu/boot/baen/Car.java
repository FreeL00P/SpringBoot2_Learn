package com.atguigu.boot.baen;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/19 9:55    since 1.0.0
 */
@Data()
@ToString()
@AllArgsConstructor()//有参构造器
@NoArgsConstructor()//无参构造器
@EqualsAndHashCode()//重写

//@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private Integer price;


}
