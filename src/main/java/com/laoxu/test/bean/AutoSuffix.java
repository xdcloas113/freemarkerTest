package com.laoxu.test.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 所在包：com.laoxu.test.bean
 * 文件名：
 * 项目：freemarkerTest
 * 功能描述：
 * 修改人：xdc
 * 修改时间：2018-11-09 17:50
 */
@Configuration
public class AutoSuffix extends WebMvcConfigurationSupport {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        //setUseSuffixPatternMatch 后缀模式匹配
        configurer.setUseSuffixPatternMatch(true);
        //setUseTrailingSlashMatch 自动后缀路径模式匹配
        configurer.setUseTrailingSlashMatch(true);
    }
}
