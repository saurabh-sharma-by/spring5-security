package com.baeldung.loginextrafieldscustom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomRestController {

	@GetMapping("/health")
	public String health() {
		return "OK";
	}
}
