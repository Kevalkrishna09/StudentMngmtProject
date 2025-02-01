package com.example.SCM.Project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SCMController {

    @RequestMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("name","Keval");
        return "about";
    }
    @RequestMapping("/contact")
    public String contactPage(Model model){
        model.addAttribute("name","Keval");
        return "contact";
    }
    @RequestMapping("/home")
    public String homePage(Model model){
        model.addAttribute("name","Keval");
        return "home";
    }
    @GetMapping("/services")
    public String servicesPage(Model model){
        model.addAttribute("name","Keval");
        return "services";
    }
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }
    
}
