package lk.tdm.bean.spring_bean.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.tdm.bean.spring_bean.annotation")
public class AppConfig {
}

/**

 * @Configuration:
     * This annotation marks the AppConfig class as a configuration class,
     * which is equivalent to an XML configuration file.
     * It tells Spring that this class contains bean definitions and configuration information.

 * @ComponentScan:
     * This annotation enables component scanning in the specified package (lk.tdm.spring_bean.annotation in this case).
     * Spring will scan this package and its sub-packages for classes annotated with @Component, @Service, @Repository, or @Controller
     * and automatically register them as beans.

 */