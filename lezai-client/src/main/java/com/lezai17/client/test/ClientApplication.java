package com.lezai17.client.test;

import com.lezai17.model.test.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SpringBootApplication
@ServletComponentScan
@EnableCaching
public class ClientApplication extends WebMvcConfigurerAdapter {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);
        AbcService bean = run.getBean(AbcService.class);
        System.out.println(bean.echoService.echo("abccc"));
        User user = new User();
        user.setPassword("123456");
        user.setUsername("张三");
        System.out.println(bean.echoService.insertUser(user));
    }
}
