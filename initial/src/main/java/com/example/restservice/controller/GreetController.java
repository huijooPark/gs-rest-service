package com.example.restservice.controller;

import com.example.restservice.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/greet")
public class GreetController {

    private static final Logger logger = LoggerFactory.getLogger(GreetController.class);

    @GetMapping("")
    public List<Map<String,String>> greeting(){

        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        map.put("greeting", "greeting");

        list.add(map);
        return list;
    }

    @PostMapping("")
    public User regUser(@RequestBody User user){
        logger.info("regUser 등록");
        logger.info("user_name :" + user.getName());
        logger.info("user_age :" + user.getAge());
        logger.info("user_address :" + user.getAddress());
        logger.info("test :" + user.getAddress());

        return user;
    }

}
