package com.job.siteapp.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

	@RequestMapping("index.htm")
	public String home(HttpServletRequest request) {
		request.setAttribute("result", homeService.sayHello());
		return "index";
	}
}
