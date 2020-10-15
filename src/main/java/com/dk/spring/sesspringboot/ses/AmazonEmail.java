package com.dk.spring.sesspringboot.ses;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class AmazonEmail {

    private List<String> to;
    private List<String> cc;
    private List<String> bcc;
    private SESFrom from;
    private String subject;
    private String body;
    private boolean html;
    private List<AmazonAttachment> files;

    public AmazonEmail() {
        this.to = new ArrayList<>();
        this.cc = new ArrayList<>();
        this.bcc = new ArrayList<>();
        this.from = SESFrom.NO_REPLY;
        this.files = new ArrayList<>();
        this.html = true;
    }

    public AmazonEmail(String to, String subject, String body) {
        this.to = new ArrayList<>();
        this.to.add(to);
        this.subject = subject;
        this.body = body;
        this.html = true;
        this.files = new ArrayList<>();
        this.from = SESFrom.NO_REPLY;
        this.cc = new ArrayList<>();
        this.bcc = new ArrayList<>();
    }

    public AmazonEmail(String to, SESFrom from, String subject, String body) {
        this.to = new ArrayList<>();
        this.to.add(to);
        this.from = from;
        this.subject = subject;
        this.body = body;
        this.html = true;
        this.files = new ArrayList<>();
        this.cc = new ArrayList<>();
        this.bcc = new ArrayList<>();
    }

    public AmazonEmail(String to, SESFrom from, String subject, String body, List<String> cc) {
        this.to = new ArrayList<>();
        this.to.add(to);
        this.from = from;
        this.subject = subject;
        this.body = body;
        this.cc = cc;
        this.html = true;
        this.files = new ArrayList<>();
        this.bcc = new ArrayList<>();
    }

    public AmazonEmail(String to, SESFrom from, String subject, String body, List<String> cc, List<String> bcc) {
        this.to = new ArrayList<>();
        this.to.add(to);
        this.from = from;
        this.subject = subject;
        this.body = body;
        this.cc = cc;
        this.bcc = bcc;
        this.html = true;
        this.files = new ArrayList<>();
    }

    public AmazonEmail(List<String> to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.html = true;
        this.files = new ArrayList<>();
        this.from = SESFrom.NO_REPLY;
        this.cc = new ArrayList<>();
        this.bcc = new ArrayList<>();
    }

    public AmazonEmail(List<String> to, SESFrom from, String subject, String body) {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.body = body;
        this.html = true;
        this.files = new ArrayList<>();
        this.cc = new ArrayList<>();
        this.bcc = new ArrayList<>();
    }

    public AmazonEmail(List<String> to, String subject, String body, boolean html) {
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.html = html;
        this.files = new ArrayList<>();
        this.from = SESFrom.NO_REPLY;
        this.cc = new ArrayList<>();
        this.bcc = new ArrayList<>();
    }

    public AmazonEmail(List<String> to, SESFrom from, String subject, String body, boolean html) {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.body = body;
        this.html = html;
        this.cc = new ArrayList<>();
        this.bcc = new ArrayList<>();
    }

    public AmazonEmail(List<String> to, SESFrom from, String subject, String body, boolean html, List<AmazonAttachment> files) {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.body = body;
        this.html = html;
        this.files = files;
        this.cc = new ArrayList<>();
        this.bcc = new ArrayList<>();
    }


    public String getFrom() {
        return String.format("\"%s\" <%s>", from.getName(), from.getEmail());
    }
}
