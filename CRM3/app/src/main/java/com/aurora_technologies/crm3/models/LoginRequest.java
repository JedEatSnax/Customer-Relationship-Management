package com.aurora_technologies.crm3.models;

public class LoginRequest {
    private String email;
    private String password;
    private String role;

    public LoginRequest(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }
    // getters and setters (optional, for Gson)
}
