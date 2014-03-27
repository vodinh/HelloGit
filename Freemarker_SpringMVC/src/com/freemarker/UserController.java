package com.freemarker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * change from jasonvo user
 */
@Controller
public class UserController {
	
	private static List<User> users = new ArrayList<User>();
	static{
		users.add(new User("Hieu", "Vo"));
		users.add(new User("Jason","Vo"));
		users.add(new User("Tien","Nguyen"));
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(@ModelAttribute("model") ModelMap model){
		model.addAttribute("users", users);
		return "index";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String add(@ModelAttribute("user") User user){
		 if (null != user && null != user.getFirstname()
	                && null != user.getLastname() && !user.getFirstname().isEmpty()
	                && !user.getLastname().isEmpty()) {
	 
	            synchronized (users) {
	                users.add(user);
	            }
	 
	        }
		 return "redirect:index.html";
	}
	/**
	 * change from jasonvo user
	 *//**
	 * change from jasonvo user
	 */
}
