package com.laoxu.test.bean;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import java.util.Properties;

/**
 * 所在包：com.laoxu.test.bean
 * 文件名：
 * 项目：freemarkerTest
 * 功能描述：
 * 修改人：xdc
 * 修改时间：2018-11-09 15:52
 */
//@Configuration
public class JspAndFreeMarker {



    /**
     * 对jsp支持
     * @return
     */
    @Bean
    public ViewResolver getJspViewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
        internalResourceViewResolver.setSuffix(".jsp");
//        internalResourceViewResolver.setViewNames("jsp/*");
        internalResourceViewResolver.setOrder(1);
        return internalResourceViewResolver;
    }

    /**
     * freemarker支持
      * @return
     */
    @Bean
    public FreeMarkerConfigurer getFreeMarkerConfigurer(){
        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        Properties freemarkerSettings  = new Properties();
        freemarkerSettings.setProperty("default_encoding","UTF-8");
        freemarkerSettings.setProperty("output_encoding","UTF-8");
        freemarkerSettings.setProperty("locale","zh_CN");
        freemarkerSettings.setProperty("datetime_format","yyyy-MM-dd HH:mm:ss");
        freemarkerSettings.setProperty("boolean_format","true,false");
        freemarkerSettings.setProperty("number_format","0.##");
        freeMarkerConfigurer.setFreemarkerSettings(freemarkerSettings);
        freeMarkerConfigurer.setTemplateLoaderPath("classpath:/templates/");
        return freeMarkerConfigurer;
    }


    @Bean
    public FreeMarkerViewResolver getFreeMarkerViewResolver() {
        FreeMarkerViewResolver freeMarkerViewResolver = new FreeMarkerViewResolver();
        freeMarkerViewResolver.setCache(false);
        freeMarkerViewResolver.setPrefix("");
        freeMarkerViewResolver.setSuffix(".html");
//        freeMarkerViewResolver.setSuffix(".ftl");
        freeMarkerViewResolver.setRequestContextAttribute("request");
        freeMarkerViewResolver.setOrder(0);
        freeMarkerViewResolver.setContentType("text/html;charset=UTF-8");
        return freeMarkerViewResolver;
    }
}
