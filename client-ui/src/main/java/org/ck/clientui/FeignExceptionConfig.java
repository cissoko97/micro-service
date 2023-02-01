package org.ck.clientui;

/*
 * @author Boris Cissoko
 * @project microservice-commandes
 * @created 26/01/2023 - /20:38
 */

import org.ck.clientui.exceptions.CustomErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignExceptionConfig {

    @Bean
    public CustomErrorDecoder mCustomErrorDecoder(){
        return new CustomErrorDecoder();
    }
}
