package com.andy.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/world")
    public String helloWorld(String s){
        System.out.println("input val :" + s);
        return "input val : "+ s;
    }

    @RequestMapping("/getFromConsumer")
    public String getFromRPC(String str){
        // Method one
//        String forObject = new RestTemplate().getForObject("http://localhost:8881/hi?s=" + str, String.class);

        // Method two
        // according to service name  , get service list , choose one service , tcp
//        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-server");

        // Method three
        String forObject = restTemplate.getForObject("http://eurekaClient/hi?s=" + str, String.class);

        return forObject;
    }
}
