package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.model.User;
import com.example.model.registerEmail;
import com.example.model.jwtModel.JwtRequest;
import com.example.model.jwtModel.JwtResponse;
import com.example.model.registerModel.registerRequest;
import com.example.service.RegisterEmailService;
import com.example.service.userService;
@RestController
@Component
@RequestMapping("/api")

public class userController {
	@Autowired userService userService;
	 @Autowired
	    private RegisterEmailService emailService;
	@PostMapping("/register")
	
	public boolean get(@RequestBody registerRequest registerRequest) throws Exception {
		User  returnUser = this.userService.registerUser(registerRequest);
		registerEmail regEmail = new registerEmail(returnUser.getemail(),"<p>Your verification code is  "+returnUser.gettoken()+"</p>","", "");
		try {
			boolean ifSentEmail = emailService.sendSimpleMail(regEmail);
			return ifSentEmail;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
		
		
		
	}
}