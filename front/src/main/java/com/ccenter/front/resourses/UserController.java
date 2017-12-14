package com.ccenter.front.resourses;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ccenter.front.model.User;

@Controller
public class UserController {
	
	@GetMapping("/register")
	public void register(Model model) {
		model.addAttribute("user", new User());
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute("user") User user) {
		//validate
		//post to server
		return "register";
	}
}
