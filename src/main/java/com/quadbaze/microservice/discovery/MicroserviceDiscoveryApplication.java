package com.quadbaze.microservice.discovery;

import com.quadbaze.microservice.discovery.browser.BrowserUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

@EnableEurekaServer
@SpringBootApplication
public class MicroserviceDiscoveryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MicroserviceDiscoveryApplication.class, args);

		//Launch home-page to browser if environment is dev
		if(context.getEnvironment().getProperty("spring.profiles.active").equals("dev")){
			BrowserUtil.browse(context.getEnvironment().getProperty("discovery.server.uri"));
		}

	}
}
