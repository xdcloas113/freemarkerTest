package com.laoxu.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@ServletComponentScan //在spring启动的时候扫描@WebServlet注解,并实例化.
//@MapperScan("com.zxs.mapper") //扫描mapper类生成代理对象
public class FreemarkerApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(FreemarkerApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(FreemarkerApplication.class, args);
	}
}
