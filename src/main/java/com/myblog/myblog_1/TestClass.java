package com.myblog.myblog_1;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestClass {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("Testing"));
    }
}

