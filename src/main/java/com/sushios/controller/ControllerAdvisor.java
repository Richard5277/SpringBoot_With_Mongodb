//package com.sushios.controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@ControllerAdvice(annotations = RestController.class)
//public class ControllerAdvisor {
//
//    @ModelAttribute
//    public void addAttributes(HttpServletRequest request, HttpServletResponse response, Model model, @RequestBody String requestString, @RequestHeader(value = "User-Agent") String userAgent) {
//
//        System.out.println("👉 👉 👉 Request >>\n" + request);
//        System.out.println("👉 👉 👉 Response >>\n" + response);
//        System.out.println("👉 👉 👉 Request String >>\n" + requestString);
//        System.out.println("👉 👉 👉 UserAgent >>\n" + userAgent);
//        model.addAttribute("attr1", "value1");
//        model.addAttribute("attr2", "value2");
//
//    }
//}