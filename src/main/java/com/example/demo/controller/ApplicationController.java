package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.models.ApplicationUser;
import com.example.demo.service.ApplicationService;

@Controller
@RequestMapping("/")
public class ApplicationController {

	@Autowired
	ApplicationService applicationService;

	@GetMapping
	@ResponseBody
	public String applicationController() {
		return "Hola mundo";
	}

	@RequestMapping(value = { "/getUsers" }, method = { RequestMethod.GET })
	@ResponseBody
	public ResponseEntity<List<ApplicationUser>> getUsers() {
		List<ApplicationUser> users = applicationService.getUsers();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

}
