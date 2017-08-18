package com.vows.web.init.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by jazzy-zhao on 2017/8/18.
 */
@Configuration
@ComponentScan(basePackages = {"com.vows.web"},
        excludeFilters = {
              @ComponentScan.Filter(type= FilterType.ANNOTATION,value=EnableWebMvc.class)
        })
@EnableWebMvc
@ImportResource("classpath*:*_web.xml")
public class WebConfig {
}
