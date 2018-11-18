package com.alan.controller;

import com.alan.configuer.StudentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /**

    @Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;
     *
     */
    @Autowired
    private StudentProperties studentProperties;

    @RequestMapping(value = "/hello/{id}",method = RequestMethod.GET)
    public String toString(@PathVariable("id")Integer myId) {
        return studentProperties.getName()+"id="+myId;
    }
}
