package com.job.siteapp.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.job.siteapp.common.globality.BaseController;
import com.job.siteapp.service.HomeService;

/**
 * 主页相关请求
 *
 * @author seanwg
 * 2016-6-1 下午09:10:09
 */
@Controller
public class HomeController extends BaseController {
	
	@Resource
	private HomeService homeService;

	@RequestMapping(value = "index.htm", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		request.setAttribute("result", homeService.sayHello());
		return "index";
	}
	
	/**
	 * 因为要测试GET/POST方法，所以不指定该请求的类型
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "test")
	public String test(HttpServletRequest request) {
		int a = 5/0;
		return "index";
	}
}
