package de.smartheating.cloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@EnableZuulProxy
@ComponentScan(basePackages = {"de.smartheating.SmartHeatingCommons","de.smartheating.cloudgateway"})
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class CloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayApplication.class, args);
	}

}
