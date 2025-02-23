package com.luv2code.springboot.thymeleaf_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/student-form")
    public String getStudentForm() {
        return "student-form";
    }

    @RequestMapping("/process-form")
    public String processStudentForm() {
        return "process-form";
    }
}
