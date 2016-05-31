package com.job.siteapp.service;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.job.siteapp.common.globality.BaseService;
import com.job.siteapp.common.globality.response.Result;
import com.job.siteapp.domain.User;
import com.job.siteapp.repositoey.UserRepositoey;

/**
 * 用户业务
 *
 * @author seanwg
 * 2016-5-31 下午09:24:38
 */
@Service
public class UserService extends BaseService {

	@Resource
	private UserRepositoey userRepositoey;
	
	public Result registUser(User user) {
		if (StringUtils.isEmpty(user.getName()) || StringUtils.isEmpty(user.getPwd())) {
			return result.setAll(0, "用户名或密码不能为空！", null);
		}
		try {
			userRepositoey.save(user);
		} catch (Exception e) {
			return result.setAll(0, "用户名已被占用！", null);
		}
		return result.setAll(1, "Done", null);
	}
}
