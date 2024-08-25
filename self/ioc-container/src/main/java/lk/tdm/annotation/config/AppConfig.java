package lk.tdm.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.tdm.annotation")
public class AppConfig {
}

/**
 * @Configuration: Marks this class as a configuration class.
 * @ComponentScan: Tells Spring to scan the "lk.tdm.annotation" package for components like @Service, @Controller, and others.
 */