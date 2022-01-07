package com.ptit.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ptit.model.UserModel;

@Controller("homeControllerOfWeb")
public class HomeController {

	@GetMapping(value = { "/", "/trang-chu" })
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("/web/home");
		UserModel model = new UserModel("Đỗ Minh Hiếu", 23);
		mav.addObject("model", model);
		return mav;
	}
}
