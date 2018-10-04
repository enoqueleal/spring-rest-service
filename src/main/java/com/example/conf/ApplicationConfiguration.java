package com.example.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Spring configuration class 
 * @author Administrador
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.example")
public class ApplicationConfiguration { }
