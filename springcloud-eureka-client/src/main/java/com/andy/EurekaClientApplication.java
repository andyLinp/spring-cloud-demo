package com.andy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication
{
    public static void main( String[] args )
    {
        System.out.println( "Eureka Client : Hello World!" );
        SpringApplication.run(EurekaClientApplication.class,args);
    }

    /**
     *  采用Ribbon做服务调用，需要使用RestTemplate
     *  RestTemplate是标识为负载均衡的
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
