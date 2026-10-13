package com.coharate.demo.imp;

import com.coharate.demo.NotificaitonService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary // this we get primary
@Component
@Qualifier("SmsNotify")
public class SmsNotifiantionService implements NotificaitonService {
    @Override
    public void send(String message) {
        System.out.println("SMS Notifiant "+message);
    }
}
