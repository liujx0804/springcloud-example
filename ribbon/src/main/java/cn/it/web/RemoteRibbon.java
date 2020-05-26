package cn.it.web;

import cn.it.service.RemoteService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RemoteRibbon {

    @Autowired
    RemoteService remoteService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name) {
        return remoteService.hiService(name);
    }
}
