package com.dk.spring.sesspringboot.controller;

import com.dk.spring.sesspringboot.ses.AmazonEmail;
import com.dk.spring.sesspringboot.ses.SESFrom;
import com.dk.spring.sesspringboot.ses.SESProcessor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String index() {

        //send Email using default NO_REPLY from email
        SESProcessor.getInstance().add(new AmazonEmail(
        "dxdy421@gmail.com",
        "Hello",
        "Another spam"));

        //send Email using ATTA from email
        SESProcessor.getInstance().add(new AmazonEmail(
        "dxdy@gmail.com",
        SESFrom.DAVID,
        "Hey David",
        "Another spam"));

        return "Emails Sent!";
    }
}
