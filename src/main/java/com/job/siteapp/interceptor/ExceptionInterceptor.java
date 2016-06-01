package com.job.siteapp.interceptor;

import java.util.concurrent.TimeoutException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.job.siteapp.common.globality.response.Result;

public class ExceptionInterceptor implements HandlerExceptionResolver {

	private static final Logger logger = LoggerFactory.getLogger(ExceptionInterceptor.class);
	
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		String errMsg = "系统繁忙";
		Result result = new Result();
		if (ex instanceof TimeoutException) {
			errMsg = "服务器处理超时";
		}
		
		result.setMsg(errMsg);
		ModelAndView model = new ModelAndView();
		if (isAjaxRequest(request)) {
			MappingJackson2JsonView view = new MappingJackson2JsonView();
			view.addStaticAttribute("result", request);
			model.setView(view);
			return model;
		}
		model.addObject("result", result);
		model.setViewName("500");
		logger.error(errMsg, ex);
		return model;
	}
	
	private static boolean isAjaxRequest(HttpServletRequest request) {
		String requestedWith = request.getHeader("X-Requested-With");
		return StringUtils.equals(requestedWith, "XMLHttpRequest");
	}

}
