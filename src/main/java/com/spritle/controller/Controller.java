package com.spritle.controller;

import java.lang.ProcessBuilder.Redirect;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.spritle.dto.MasterDto;
import com.spritle.dto.StudentDto;

@org.springframework.stereotype.Controller
public class Controller {


	@GetMapping("/index")
	public ModelAndView getHomePage(ModelAndView modelAndView) {
		modelAndView.setViewName("login");
		return modelAndView;
	}

	@PostMapping("/authenticate")
	public String validate(@RequestParam("userid") String userid, @RequestParam("password") String password,
			HttpServletRequest request) {
		MasterDto masterDto = new MasterDto();
		StudentDto studentDto = new StudentDto();
		HttpSession session = request.getSession(true);
		if (userid.equals(masterDto.getUserid()) && password.equals(masterDto.getPassword())) {
//			modelAndView.setViewName("calculator");
			session.setAttribute("user", userid);
			session.setAttribute("pswd", password);
			return "calculator";
		} else if (userid.equals(studentDto.getUserId()) && password.equals(masterDto.getPassword())) {
//			modelAndView.setViewName("calculator");
			session.setAttribute("user", userid);
			session.setAttribute("pswd", password);
			return "calculator";
		} else 
			return "login";

	}

	@GetMapping("/adds")
	public String addValues(@SessionAttribute(name = "user", required = false) String userid,
			@SessionAttribute(name = "pswd", required = false) String password) {
		if (userid != null && password != null) {
			return "calculator";
		} else {
			return "login";
		}

	}

	@RequestMapping(value = "/add", method=RequestMethod.GET)
	public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {

		int result = num1 + num2;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("result", result);
		return mv;
	}

	@RequestMapping(value = "/subtract")
	public ModelAndView subtract(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		int result = num1 - num2;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("result", result);
		return mv;
	}

	@RequestMapping(value = "/multiply")
	public ModelAndView multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		int result = num1 * num2;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("result", result);
		return mv;
	}

	@RequestMapping(value = "/divide")
	public ModelAndView divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		int result = num1 / num2;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("result", result);
		return mv;
	}
	
	@RequestMapping(value="/logout")
	public ModelAndView logout(HttpServletRequest request,HttpServletResponse response,ModelAndView view) {
		HttpSession session = request.getSession(false);
		session.invalidate();
		 view.setViewName("login");
		return view;

}
}