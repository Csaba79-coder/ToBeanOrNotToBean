package com.csaba79coder.demo.tobeanornottobean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class StudentController {

    @GetMapping("/xml-bean")
    public String displayBeanOfXml() {
        return "index";
    }
}
