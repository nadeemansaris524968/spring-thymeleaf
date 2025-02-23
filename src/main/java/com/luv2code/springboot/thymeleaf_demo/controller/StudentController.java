package com.luv2code.springboot.thymeleaf_demo.controller;

import com.luv2code.springboot.thymeleaf_demo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @GetMapping("/studentForm")
    public String getStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @PostMapping("/processForm")
    public String processStudentForm() {
        return "process-form";
    }

    @PostMapping("/processFormV2")
    public String processFormV2(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        model.addAttribute("message", name);
        return "process-form-v2";
    }

    @PostMapping("/processFormV3")
    public String processFormV3(@RequestParam("studentName") String studentName, Model model) {

        studentName = "From v3: " + studentName;
        model.addAttribute("message", studentName);
        return "process-form-v3";
    }
}
