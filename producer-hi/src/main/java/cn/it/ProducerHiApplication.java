package cn.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@RestController
public class ProducerHiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerHiApplication.class, args);
    }

    @GetMapping("/hi")
    public String test(@RequestParam(value = "name",defaultValue = "xixi") String name){
        return "负载均衡轮循"+name;
    }
}
