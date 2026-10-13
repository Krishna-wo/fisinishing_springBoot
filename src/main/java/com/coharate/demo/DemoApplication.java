package com.coharate.demo;
import com.coharate.demo.imp.EmailNotificationService;
import com.coharate.demo.imp.SmsNotifiantionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
//
//    @Autowired
//	NotificaitonService notificaitonService; // thsi where field dipendcy injeciotn but we have to construciton di

	// constructore di
	final NotificaitonService notificaitonService;
	public DemoApplication(NotificaitonService notificaitonService) {
		this.notificaitonService = notificaitonService;
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		NotificaitonService notificaitonService=new SmsNotifiantionService();
//		notificaitonService.send("Hello World");
//		NotificaitonService notificaitonService2 = new EmailNotificationService();
//		notificaitonService2.send("Hello World");
//		// but we want to cahnge it dy=namicaaly
		notificaitonService.send("Hello World!");

	}
}

