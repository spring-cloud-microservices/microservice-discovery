package com.quadbaze.microservice.discovery;

import com.quadbaze.microservice.discovery.browser.BrowserUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroserviceDiscoveryApplication {

	public static void main(String[] args) {
		BrowserUtil.browse(
				SpringApplication.run(MicroserviceDiscoveryApplication.class, args)
						.getEnvironment()
						.getProperty("discovery.server.uri")
		);
	}
}
