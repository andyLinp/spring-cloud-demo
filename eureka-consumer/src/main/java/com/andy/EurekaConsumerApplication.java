package com.andy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient // 当前使用的eureka的server
public class EurekaConsumerApplication
{
    public static void main( String[] args )
    {
        System.out.println( "Eureka Consumer : Hello World!" );
        SpringApplication.run(EurekaConsumerApplication.class,args);
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
