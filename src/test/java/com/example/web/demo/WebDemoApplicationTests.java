package com.example.web.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

@SpringBootTest
class WebDemoApplicationTests {

    @Test
    void contextLoads() {
        try {
            //深圳国药密码加密
            String base64encodedString = Base64.getEncoder().encodeToString("Cd-13168".getBytes("utf-8"));
            System.out.println(base64encodedString);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

}
