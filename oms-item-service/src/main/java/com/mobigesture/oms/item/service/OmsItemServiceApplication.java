package com.mobigesture.oms.item.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ignat
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OmsItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmsItemServiceApplication.class, args);
	}

}
