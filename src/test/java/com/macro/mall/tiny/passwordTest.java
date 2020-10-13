package com.macro.mall.tiny;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class passwordTest {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void run() {
        String encodePassword = passwordEncoder.encode("123456");
        System.out.println(encodePassword);
    }
}
