package com.numeriano.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//Anotaçõo necessário para uso do Hystrix
@EnableCircuitBreaker
@EnableEurekaClient
//@RibbonClient(name = "hr-worker")
@EnableFeignClients
@SpringBootApplication
public class HrPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPayrollApplication.class, args);
	}

}
