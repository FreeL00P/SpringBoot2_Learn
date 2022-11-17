package com.atguigu.boot;

import com.atguigu.boot.baen.Pet;
import com.atguigu.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/18 21:26    since 1.0.0
 */
//这是一个springboot应用

@Import(Pet.class)//@Import(Per.class)给容器自动创建出这两个类型的组件 默认组件的名字就是全类名
@SpringBootApplication()
@ImportResource("classpath:beans.xml")
public class MainApplication {
    public static void main(String[] args) {
        //返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //查看容器内的组件
//        String[] names = run.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }
//        //从容器中获取组件
//        Pet pet1 = run.getBean("tom", Pet.class);
//        Pet pet2 = run.getBean("tom", Pet.class);
//        System.out.println(pet2==pet1);
//        //如果proxyBeanMethods = true 代理对象调用方法 springboot总会检查这个组件是否在容器在存在
//        // 保持单实例
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println(bean);
//        Pet pet3 = bean.tomcatPet();
//        Pet pet4 = bean.tomcatPet();
//        System.out.println(pet3==pet4);
//        System.out.println("-----------------------");
//
//        String[] beanNamesForType = run.getBeanNamesForType(Pet.class);
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }
        boolean tom22 = run.containsBean("tom22");
        System.out.println("tom22 = " + tom22);
        boolean hehe = run.containsBean("hehe");
        System.out.println("hehe = " + hehe);
    }
}
