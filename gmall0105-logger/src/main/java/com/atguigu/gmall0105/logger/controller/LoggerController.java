package com.atguigu.gmall0105.logger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoggerController {

    @RequestMapping("/applog")
    public String log(@RequestBody String log){

        System.out.println(log);
        return log;

    }
}
