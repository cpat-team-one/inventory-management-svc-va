package com.ibm.health;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("HeathEndPointMain")

public class HealthEndpoint implements HealthIndicator {

    private static final Logger LOGGER = LoggerFactory.getLogger(HealthEndpoint.class);

    @Override
    @GetMapping("/health")
    public Health health() {
        /*
          if (!healthy) {
           return Health.down().withDetail("Not healthy", 500).build();
          }
        */

        LOGGER.info("App is healthy!!");

        return Health.up().build();
    }
}
