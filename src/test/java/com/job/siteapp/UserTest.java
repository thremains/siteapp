package com.job.siteapp;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.job.Application;
import com.job.siteapp.common.globality.response.Result;
import com.job.siteapp.domain.User;
import com.job.siteapp.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UserTest {
	
	private static final Logger logger = LoggerFactory.getLogger(UserTest.class);
	
	@Resource
	private UserService userService;

	@Test
	public void testRegist() {
		User user = new User();
		user.setName("小米");
		user.setPwd("1122323");
		Result registUser = userService.registUser(user);
		logger.info(JSON.toJSONString(registUser));
	}
}
