package com.coharate.demo.imp;

import com.coharate.demo.NotificaitonService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emailNotif")
public class EmailNotificationService implements NotificaitonService {

    @Override
    public void send(String message) {
        System.out.println("Email Notifiant "+message);
    }
}
