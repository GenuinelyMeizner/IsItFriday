package com.example.demo.controllers;

import com.example.demo.services.MyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/friday")
    @ResponseBody
    public String friday() {

        MyService myService = new MyService();

        myService.isItFriday();

        if (myService.isItFriday() == 5) {
            return "Yes";
        }

        else {
            return "No";
        }
    }
}
