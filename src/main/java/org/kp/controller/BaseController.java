package org.kp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

	
	@RequestMapping("/")
	@ResponseBody
	String baseGet() {
		return "Current Time in ms: "+System.currentTimeMillis();
	}
	
}
