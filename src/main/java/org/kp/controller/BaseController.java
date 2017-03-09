package org.kp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

	
	@RequestMapping("/")
	@ResponseBody
	String baseGet() {
		return "Hello World "+System.currentTimeMillis();
	}
	
}
