package cn.it.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RemoteService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        String forObject = restTemplate.getForObject("http://server02/hi?name=" + name, String.class);
        System.out.println(forObject);
        return forObject;
    }

    public String hiError(String name) {
        return "Hystrix：" + name;
    }
}
