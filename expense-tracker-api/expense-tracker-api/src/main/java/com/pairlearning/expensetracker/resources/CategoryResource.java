package com.pairlearning.expensetracker.resources;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/categories")
public class CategoryResource {
    
    @GetMapping("")
    public String getAllCategories(HttpServletRequest request) {    //Receives request from the filter
        int userId = (Integer) request.getAttribute("userId");
        
    }
    
}
