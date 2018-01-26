package com.joo.mapper;

import com.joo.service.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HelloMapper {
    String getHelloMsg();
}
