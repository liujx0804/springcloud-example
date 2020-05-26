package cn.it.api;

import cn.it.api.impl.FeignRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "server02",fallbackFactory = FeignRemoteHystrix.class)
public interface FeignApi {
    @GetMapping("/hi")
    String hi(@RequestParam String name);
}
