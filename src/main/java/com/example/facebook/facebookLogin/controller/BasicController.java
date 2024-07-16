package com.example.facebook.facebookLogin.controller;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

	   @GetMapping("/")
	    public String home() {
	        return "index";
	    }

	    @GetMapping("/friends")
	    public String friends(@AuthenticationPrincipal OAuth2User principal, Model model) {
	        model.addAttribute("user", principal);
	        return "friends";
	    }
}