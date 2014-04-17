package hb.account.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @FileName: AccountController
 * 
 * @FileType: Class
 * 
 * @Date: 2014年3月7日  2014年3月7日 10:07:24
 * 
 * @Author: lj
 * 
 * @Description: 帐号管理Controller（为发送消息使用）
 * 
 */
@Controller
@RequestMapping(value = "/account")
public class AccountController {

	Logger log = Logger.getLogger(AccountController.class);
	
	 /**
	  * 查询的展示界面
	  * @param request
	  * @param response
	  * @return
	  */
	@RequestMapping(value = "/accList")
	public ModelAndView showaccountList(HttpServletRequest request,
			HttpServletResponse response) {
		//跳转到list查询的jsp页面
		log.debug("showaccountList");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/account/accList");
		return mv;
	}
	
}
