package io.github.wynn5a.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fuwenming on 2017/4/8.
 */
@RestController
public class ProviderInfoController {
    @Value("${common.hello}")
    private String hello;

    @GetMapping("/hello")
    public String hello() {
        return hello;
    }
}
