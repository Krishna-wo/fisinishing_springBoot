package com.coharate.demo.imp;

import com.coharate.demo.NotificaitonService;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService implements NotificaitonService {

    @Override
    public void send(String message) {
        System.out.println("Email Notifiant "+message);
    }
}
