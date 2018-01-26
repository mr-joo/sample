package com.joo.controller;

import com.joo.service.Hello;
import com.joo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String print() {
        return "view";
    }

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hellodb")
    public String helloDb(Model model) {
        String msg = helloService.getHelloMsg();
        model.addAttribute("msg", msg);
        return "db";
    }
}
