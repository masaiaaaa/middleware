package com.debug.middleware.server;
/**
 * Created by sai on 2022/5/14.
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
* 功能描述
* 
* @author: sai
* @date: 2022/5/14 9:58
*/
@SpringBootApplication
public class MainApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }

}
