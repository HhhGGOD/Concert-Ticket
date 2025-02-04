package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.io.IOException;

@SpringBootApplication
@MapperScan(basePackages = {"com.dao"})
public class RunApplication extends SpringBootServletInitializer {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(RunApplication.class, args);
        String url = "http://localhost:8080/concert/front/index.html";
		Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(RunApplication.class);
    }
}
