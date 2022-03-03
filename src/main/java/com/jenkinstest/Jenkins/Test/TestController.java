package com.jenkinstest.Jenkins.Test;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
//	@ResponseBody
//	@CrossOrigin
	@GetMapping("/hello")
	public String getName()
	{
		
		return "Hello ";
	}
	
	

}
