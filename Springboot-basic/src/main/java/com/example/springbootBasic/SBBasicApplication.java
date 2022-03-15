package com.example.springbootBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;

/**
 * @author 小易
 */


@SpringBootApplication
public class SBBasicApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SBBasicApplication.class, args);
        String ip = null;
        InetAddress ia = null;
        try {
            ia = ia.getLocalHost();
            ip = ia.getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Environment environment = context.getBean(Environment.class);

//        System.err.println("doc:http://" + ip + ":" + environment.getProperty("local.server.port") + "/doc.html");
//        System.err.println("swagger:http://" + ip + ":" + environment.getProperty("local.server.port") + "/swagger-ui.html");

    }

}