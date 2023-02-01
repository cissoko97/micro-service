package org.ck.clientui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("org.ck.clientui")
public class ClientUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientUiApplication.class, args);
    }

}
