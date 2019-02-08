package com.stackrout.keepnote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableZuulProxy
//@EnableDiscoveryClient
@SpringBootApplication
public class ZuulApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayServerApplication.class, args);
	}

}

