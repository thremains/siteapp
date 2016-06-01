package com.job.siteapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 500处理
 *
 * @author seanwg
 * 2016-6-1 下午09:31:23
 */
@Controller
public class ErrorController implements org.springframework.boot.autoconfigure.web.ErrorController {

	private static final String ERROR_PATH = "error";
	
	@RequestMapping(ERROR_PATH)
	public String handleError() {
		return "404";
	}
	
	public String getErrorPath() {
		return ERROR_PATH;
	}

}
