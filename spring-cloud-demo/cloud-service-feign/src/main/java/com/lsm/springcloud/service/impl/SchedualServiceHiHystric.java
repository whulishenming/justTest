package com.lsm.springcloud.service.impl;

import com.lsm.springcloud.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    /**
     * 熔断用
     * @param name
     * @return
     */
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
