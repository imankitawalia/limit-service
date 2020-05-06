package com.example.microservices.limitservice.controller;

import com.example.microservices.limitservice.beans.LimitsConfiguration;
import com.example.microservices.limitservice.utilities.configurations.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguration getLimitsFromConfiguration() {

        return new LimitsConfiguration(configuration.getMax(),configuration.getMin());
    }

}
