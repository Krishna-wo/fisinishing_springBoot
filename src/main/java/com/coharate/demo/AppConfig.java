package com.coharate.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration // inernally component haii lot of bean form here
public class AppConfig {
    @Bean // classicly more priorty then @ compent so this will work
    PaymentService paymentService(){
        System.out.println("hi");
        return new PaymentService();
    }


}
