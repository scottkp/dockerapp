package org.kp.controller;

import org.kp.service.FileRollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

	@Autowired
	FileRollService frService;
	
	@RequestMapping("/")
	@ResponseBody
	String baseGet(@RequestParam("type") String type) {
		String content = frService.getFileRollContents(type);
		return content+" \nCurrent Time in ms: "+System.currentTimeMillis();
	}
	
}
