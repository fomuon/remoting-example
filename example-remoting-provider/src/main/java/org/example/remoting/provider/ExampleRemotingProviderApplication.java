package org.example.remoting.provider;

import org.example.remoting.common.CabBookingService;
import org.example.remoting.provider.service.CabBookingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

@SpringBootApplication
public class ExampleRemotingProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleRemotingProviderApplication.class, args);
	}

	@Bean(name = "/booking")
	public HttpInvokerServiceExporter accountService() {
		HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
		exporter.setService( new CabBookingServiceImpl() );
		exporter.setServiceInterface( CabBookingService.class );
		return exporter;
	}
}
