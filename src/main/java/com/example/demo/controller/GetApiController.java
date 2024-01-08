package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GetApiController {


    @GetMapping("query-param03")
    public String queryParam03()

    {
        return "dd";
    }

}
