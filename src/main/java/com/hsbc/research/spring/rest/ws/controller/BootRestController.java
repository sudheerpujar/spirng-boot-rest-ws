package com.hsbc.research.spring.rest.ws.controller;

import com.hsbc.research.spring.rest.ws.beans.Boot;
import com.hsbc.research.spring.rest.ws.beans.RestBoot;
import com.hsbc.research.spring.rest.ws.builder.impl.BootBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sudhe on 29-08-2016.
 */
@RestController
@RequestMapping(path="/bootrest")
public class BootRestController {

    @GetMapping(path="/status")
    @ResponseBody
    public String status(){
        return "Boot is resting while running";
    }

    @PostMapping(path="/boot/create")
    @ResponseBody
    public RestBoot createBoot(@RequestBody RestBoot restBoot){

        Boot boot=new BootBuilder().id(restBoot.getId())
                .name(restBoot.getName())
                .date(restBoot.getDate())
                .amount(restBoot.getAmount())
                .build();
        return new RestBoot(boot.getId(),boot.getName(),boot.getDate(),boot.getAmount());
    }
}
