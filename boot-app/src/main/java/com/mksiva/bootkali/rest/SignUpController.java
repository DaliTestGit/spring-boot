package com.mksiva.bootkali.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mksiva.bootkali.model.UserDO;

@RestController
@RequestMapping("/api")
public class SignUpController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String home() {
		return "MyApp Interface API Service is running!";
	}

	@RequestMapping(value = "/status", method = RequestMethod.GET)
	public String status() {
		return "MyApp Interface API Service is running!";
	}

	@RequestMapping(value = "/user/{email}", method = RequestMethod.GET)
	@ResponseBody
	public String getUserByEmail(@PathVariable("email") String email) {
		return email;
	}

	@RequestMapping(value = "/userCreationResult/{email}", method = RequestMethod.GET)
	@ResponseBody
	public String userCreationResultByKey(@PathVariable("email") String email) {
		return "User [" + email + "] creation is in progres..";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public String createUser(@RequestBody UserDO aUserDO) {
		return aUserDO.getEmail();
	}
}