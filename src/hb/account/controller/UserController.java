package hb.account.controller;

import hb.account.service.UserService;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 用户的controller类，用户出来servlet请求
 */
@Controller
@RequestMapping("/user") 
public class UserController {
	

	private UserService userService;
	private Logger log = Logger.getLogger(UserController.class);
	
	/**
	 * 跳转到用户显示页面
	 * @return
	 */
	@RequestMapping(value = "/queryAllUser",method={RequestMethod.GET,RequestMethod.POST})
	public String queryAllUser(){
	
		return "easyuiMain";
	}
	
}

