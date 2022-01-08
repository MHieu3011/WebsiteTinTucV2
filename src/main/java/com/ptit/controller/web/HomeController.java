package com.ptit.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("homeControllerOfWeb")
public class HomeController {

	@GetMapping(value = { "/", "/trang-chu" })
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("/web/home");
		return mav;
	}

	@GetMapping(value = "/dang-nhap")
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("/login");
		return mav;
	}
}
