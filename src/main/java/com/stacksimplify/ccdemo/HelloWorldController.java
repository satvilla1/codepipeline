package com.stacksimplify.ccdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Through cloud-formation-pipeline-release -Release 2";
	}
	
}
