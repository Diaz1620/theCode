package com.yadiel.theCode;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	
	@RequestMapping("")
	public String codeForm() {
		
		return "index.jsp";
	}
	
	@RequestMapping("/code")
	public String secretPage(HttpSession session, RedirectAttributes redirectAttrs) {
		String theCode = (String) session.getAttribute("theCode");
		System.out.println(theCode);
			if(theCode.equals("bushido")) {
						
						return "secret.jsp";
					}
					else {
						redirectAttrs.addFlashAttribute("message", "You must train harder!");
						return "redirect:/";
					}
	}
	
	@RequestMapping(value = "/check", method=RequestMethod.POST)
	public String check(@RequestParam(value="theCode") String theCode, HttpSession session, RedirectAttributes redirectAttrs) {
		session.setAttribute("theCode", theCode);
		if(theCode.equals("bushido")) {
			
			return "redirect:/code";
		}
		else {
			redirectAttrs.addFlashAttribute("message", "You must train harder!");
			return "redirect:/";
		}
		
	}
	
}
