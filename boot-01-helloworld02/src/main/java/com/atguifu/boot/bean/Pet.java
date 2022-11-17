package com.atguifu.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * Pet
 * @author fj
 * @date 2022/9/19 10:55
 */
@Data()
@Component()
@ToString()
public class Pet {
    private String name;
    private Double weight;
}
