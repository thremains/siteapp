package com.job.siteapp.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.job.siteapp.common.globality.BaseController;
import com.job.siteapp.common.globality.response.Result;
import com.job.siteapp.domain.User;
import com.job.siteapp.service.UserService;

/**
 * 用户相关请求处理
 *
 * @author seanwg
 * 2016-5-31 下午09:21:53
 */
@Controller
@RequestMapping("user/")
public class UserController extends BaseController {

	@Resource
	private UserService userService;
	
	@RequestMapping("regist")
	@ResponseBody
	public Result regist(User user) {
		return userService.registUser(user);
	}
}
