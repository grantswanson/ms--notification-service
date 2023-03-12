package com.swansong.msnotificationservice;

import com.swansong.msnotificationservice.service.EmailSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class NotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	}

	@Bean
	// method name has to match spring.cloud.stream.bindings.xxx-in-0 name in application.properties
	// E.g. Our method is notificationEventSupplier matching
	//      spring.cloud.stream.bindings.notificationEventSupplier-in-0
	public Consumer<String> notificationEventSupplier() {
		return message -> new EmailSender().sendEmail(message);
	}
}
