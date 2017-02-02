package cn.apopo.springcloud.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qiaoshuang on 2017/2/2.
 */
@RestController
@RefreshScope
public class ClientController {

    @Value("${hello.world}")
    private String helloWorld;

    @RequestMapping("/hello")
    public String hello() {
        return this.helloWorld;
    }

}
