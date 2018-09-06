package com.stackroute.mvcproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController {
	@GetMapping("/")
	public String showMsg(Model model) {
		model.addAttribute("message", "hello new bhai");

		return "index";
	}

}
