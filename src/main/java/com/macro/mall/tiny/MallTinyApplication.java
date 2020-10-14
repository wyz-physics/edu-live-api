package com.macro.mall.tiny;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MallTinyApplication {
    private static final Logger logger = LoggerFactory.getLogger(MallTinyApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(MallTinyApplication.class, args);
        logger.debug("==========================启动成功==========================");
    }

}
