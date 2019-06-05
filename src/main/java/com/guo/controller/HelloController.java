package com.guo.controller;

import com.sun.org.apache.xpath.internal.compiler.PsuedoNames;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guo
 * @create 2019-05-21 11:41
 */
@RestController
public class HelloController {


    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "hello " + name;
    }
}
