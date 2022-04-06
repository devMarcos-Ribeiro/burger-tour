package com.github.devmarcosribeiro.burgertour.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/burgers")
public class BurgerController {

    @GetMapping
    public String getBurgers() {
        log.info("[GET /burgers] Retrieving all the burgers...");
        return "Hello from burgers API";
    }

}
