package com.sailing.transmission.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * @author: wangxy
 */
@Component
@ConfigurationProperties(prefix = "hpys")
@Data
public class ConversionConfig {


    private String blue;

    private String yellow;

    private String yellowGreen;

    private String green;

    private String black;

    private String white;

    private String other;

}
