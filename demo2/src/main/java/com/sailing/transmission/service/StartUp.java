package com.sailing.transmission.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author: wangxy
 */
@Component("StartupListener")
public class StartUp implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private IAccessService accessService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        accessService.updateVehiclePlateColor();
    }
}