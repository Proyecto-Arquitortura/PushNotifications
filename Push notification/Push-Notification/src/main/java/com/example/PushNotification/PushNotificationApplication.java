package com.example.PushNotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PushNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PushNotificationApplication.class, args);
		System.out.println("My push notification");
	}

}
