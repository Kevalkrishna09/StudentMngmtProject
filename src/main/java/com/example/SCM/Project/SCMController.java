package com.example.SCM.Project;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SCM.Project.Entitites.User;
import com.example.SCM.Project.Repositories.UserRepo;
import com.example.SCM.Project.Services.userService;

import userForm.userInfo;

import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SCMController {

    @Autowired
    userService userService;
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
    public String registerPage(Model model) {
        userInfo obj= new userInfo();
        obj.setName("keval");
        model.addAttribute("userInfo", obj);
        return "register";
    }

    @PostMapping("/do-register")
    public String registerUser(@ModelAttribute userInfo userform){
        System.out.println("-------"+userform);
        User user = User.builder().name(userform.getName())
                    .email(userform.getEmail())
                    .password(userform.getPassword())
                    .about(userform.getAbout())
                    .build();
        userService.saveUser(user);
        return "redirect:/register";
    }
    
}
