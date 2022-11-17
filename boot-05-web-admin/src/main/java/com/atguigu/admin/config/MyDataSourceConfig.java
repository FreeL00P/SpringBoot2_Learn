package com.atguigu.admin.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.annotation.DateTimeFormat;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * MyDataSourceConfig
 *
 * @author fj
 * @date 2022/9/24 19:06
 */
//使用官方starter方式
@Deprecated
//@Configuration
// 普通类
public class MyDataSourceConfig {
    @Bean
    @ConfigurationProperties("spring.datasource")//将属性与配置文件进行绑定
    public DataSource dataSource() throws SQLException {
        //        druidDataSource.setUrl();
        //        druidDataSource.setUsername();
        //        druidDataSource.setPassword();

        //加入SQl监控功能 & 防火墙
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setFilters("stat,wall");
        return druidDataSource;
    }



    /**
     * 配置druid的监控页
     * @return
     */
    @Bean
    public ServletRegistrationBean statViewServlet(){
        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> registrationBean =
                                                new ServletRegistrationBean<>(statViewServlet, "/druid/*");
        registrationBean.addInitParameter("loginUsername","admin");
        registrationBean.addInitParameter("loginPassword","123456");
        return registrationBean;
    }

    /**
     * webStatFilter 监控web应用
     */
    @Bean
    public FilterRegistrationBean webStatFilter() {
        WebStatFilter webStatFilter = new WebStatFilter();
        FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean<>(webStatFilter);
        //拦截servlet的路径
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        //添加初始化参数
        filterRegistrationBean.addInitParameter("exclusions", "*.gif,*.js,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
