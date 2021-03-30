package org.sumathi.mvcAnno.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView helloWorld() {

		ModelAndView model = new ModelAndView("home");
		model.addObject("msg","hello world");

		return model;
	}

}