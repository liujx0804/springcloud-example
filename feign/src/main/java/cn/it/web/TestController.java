package cn.it.web;

import cn.it.api.FeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    FeignApi feignApi;

    @GetMapping("/hi")
    public String hi(@RequestParam String name){
        return feignApi.hi(name);
    }
}
