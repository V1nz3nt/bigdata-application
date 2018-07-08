package it.longo.bigdata.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration.class, 
		  org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration.class,
		  org.springframework.boot.actuate.autoconfigure.metrics.MetricsAutoConfiguration.class})
@ComponentScan(basePackages  = { "it.longo.bigdata" })
public class Application extends SpringBootServletInitializer{
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
