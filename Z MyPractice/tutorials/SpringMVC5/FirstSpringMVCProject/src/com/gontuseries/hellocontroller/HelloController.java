package com.gontuseries.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends AbstractController {
	

	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView model= new ModelAndView("HelloPage");
		model.addObject("WelcomeMessage","hi user");
		return model;
		// TODO Auto-generated method stub
	
	}
	

}
