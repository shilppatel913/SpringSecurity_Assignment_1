package com.aster.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/api")
public class AuthController {

	@GetMapping("/admin/dashboard")
	public ResponseEntity<String> getAdminDashboard(){
		return new ResponseEntity<String>("Admin Dashbord opens",HttpStatus.OK);
	}
	
	@GetMapping("/user/dashboard")
	public ResponseEntity<String> getUserDashboard(){
		return new ResponseEntity<String>("User Dashbord opens",HttpStatus.OK);
	}
	
	@GetMapping("/admin/new")
	public ResponseEntity<String> getNewAdmin(){
		return new ResponseEntity<String>("New admin",HttpStatus.OK);
	}
	
	@GetMapping("/user/{userid}")
	public ResponseEntity<String> getUser(@PathVariable int userid){
		String response = "the user has id "+userid;
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
}
