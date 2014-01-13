package com.huhtala.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	 @RequestMapping("/greeting")
	    public @ResponseBody Person greeting(
	            @RequestParam(value="name", required=false, defaultValue="stranger") String name) {
		 	logger.debug("Serving stuff...");
	        return new Person(name);
	    }
	
}
