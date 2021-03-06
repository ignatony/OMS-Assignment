package com.mobigesture.oms.order.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ignat
 *
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class OmsOrderServiceApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(OmsOrderServiceApplication.class, args);
	}

}
