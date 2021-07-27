package com.example.exercise_203;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/employeeform")
    public String loadFormPage(Model model){
        model.addAttribute("employee", new Employee());
        return "employeeform";
    }

    @PostMapping("/confirm")
    public String loadConfirmPage(@ModelAttribute Employee employee, Model model){
        model.addAttribute("employee", employee);
        return "confirm";
    }
}
