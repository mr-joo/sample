package com.joo.service;

import com.joo.mapper.HelloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    private HelloMapper helloMapper;

    public String getHelloMsg() {
        return helloMapper.getHelloMsg();
    }
}
