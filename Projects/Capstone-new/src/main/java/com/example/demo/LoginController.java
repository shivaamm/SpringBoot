package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/")
    public String init(Model model) {
        model.addAttribute("msg", "Please Enter Your Login Details");
        return "address";
    }
    
    
    @Autowired
    private addressRepository adRepo;
       
    @GetMapping("/users")
    public String listAll(Model model) {
        List<User> listStudents = adRepo.findAll();
        model.addAttribute("listStudents", listStudents);
           
        return "address";
    }
    
    @RequestMapping("/addusers")
    public String addUser(Model model,User address) {
    	adRepo.save(address);
		return "address";
    	
    }
    
}