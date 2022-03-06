package com.andy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
