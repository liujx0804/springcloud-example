package cn.it.api.impl;

import cn.it.api.FeignApi;
import org.springframework.stereotype.Component;

@Component
public class FeignRemoteHystrix implements FeignApi {
    @Override
    public String hi(String name) {
        return name+"： 熔断";
    }
}
