package com.b2m.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * create by gaogao on 2018/8/3
 */
@Controller
public class AnnocationController {

    @RequestMapping
    public String test(){
        return "test";
    }
}
