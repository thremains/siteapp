package com.job.siteapp.service;

import org.springframework.stereotype.Service;

import com.job.siteapp.common.globality.BaseService;
import com.job.siteapp.common.globality.response.Result;

/**
 * 首页相关业务
 *
 * @author seanwg
 * 2016-6-1 下午09:13:58
 */
@Service
public class HomeService extends BaseService {

	public Result sayHello() {
		return result.setAll(1, "Hello FreeMarker!", null);
	}

}
