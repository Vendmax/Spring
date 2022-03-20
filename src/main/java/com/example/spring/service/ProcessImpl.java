package com.example.spring.service;

import com.example.spring.model.ExternalInfo;
import org.springframework.stereotype.Component;

@Component
public class ProcessImpl implements Process {
    @Override
    public boolean run(ExternalInfo externalInfo) {
        return false;
    }
}
