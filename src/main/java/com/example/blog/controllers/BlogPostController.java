package com.example.blog.controllers;

import com.example.blog.models.BlogPost;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogPostController {

    @GetMapping("/")
    String index(BlogPost blogpost, Model model) {
        return "index";
    }



}
