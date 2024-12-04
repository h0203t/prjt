package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class Jpa1Application {

	@Value("${file.uploadpath}")
	String uploadPath;
	
	public static void main(String[] args) {
		SpringApplication.run(Jpa1Application.class, args);
	}
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("upload", uploadPath);
		return "index.html";
	}

}
