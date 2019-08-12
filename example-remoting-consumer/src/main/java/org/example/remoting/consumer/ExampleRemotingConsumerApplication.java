package org.example.remoting.consumer;

import org.example.remoting.common.CabBookingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

@SpringBootApplication
public class ExampleRemotingConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleRemotingConsumerApplication.class, args);
	}

	@Bean
	public HttpInvokerProxyFactoryBean invoker() {
		HttpInvokerProxyFactoryBean invoker = new HttpInvokerProxyFactoryBean();
		invoker.setServiceUrl("http://localhost:8080/booking");
		invoker.setServiceInterface(CabBookingService.class);
		return invoker;
	}
}
