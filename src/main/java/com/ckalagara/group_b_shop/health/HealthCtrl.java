package com.ckalagara.group_b_shop.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCtrl {

    @GetMapping("/api/v1/health")
    public String GetHealth(){
        return "UP";
    }
}
