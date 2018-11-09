package com.laoxu.test.bean;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.AbstractServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

/**
 * 解决idea springboot启动访问jsp页面问题
 */
//@Configuration
public class TomcatConfig implements WebMvcConfigurer {

    @Bean
    public AbstractServletWebServerFactory embeddedServletContainerFactory() {
        AbstractServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.setDocumentRoot(new File("D:\\kkkk\\freemarkerTest\\src\\main\\webapp"));
        return factory;
    }
}