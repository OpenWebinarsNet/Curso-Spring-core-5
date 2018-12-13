package com.openwebinars.values;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.openwebinars.values")
@PropertySource("classpath:/ejemplo.properties")
public class AppConfig {

}
