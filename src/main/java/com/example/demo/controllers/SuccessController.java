package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 *
 *
 *
 */

@Controller
public class SuccessController {

    @GetMapping("/successbuyproduct")
    public String about() {
        return "successbuyproduct";
    }
}