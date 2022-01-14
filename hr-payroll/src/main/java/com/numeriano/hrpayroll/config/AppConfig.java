package com.numeriano.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

//    Implementação do padrão de projeto Singleton e temos um rest templeta para injetar em outros serviços
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
