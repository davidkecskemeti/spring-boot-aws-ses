package com.dk.spring.sesspringboot.ses;

public enum SESFrom {

    DAVID("dxdy@dxdysestest.com", "David from SES Test"),
    NO_REPLY("noreply@dxdysestest.com", "DXDY SES Test"),
    SUPPORT("support@dxdysestest.com", "DXDY SES Support");

    private final String email;
    private final String name;

    private SESFrom(String email, String name) {
        this.email =email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
