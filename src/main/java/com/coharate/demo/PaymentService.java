package com.coharate.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

//@Service
//Repository
//@Controller
 //@RestController
// these are do same they create bean object

@Component // jo bhi claas ke ye hai uska object bna le bean me
public class PaymentService {
    public void pay() {
        System.out.println("playing");
    }
}

