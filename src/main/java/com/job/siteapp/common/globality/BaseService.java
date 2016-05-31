package com.job.siteapp.common.globality;

import com.job.siteapp.common.globality.response.Result;

public abstract class BaseService {
	
	/**
	 * 业务统一使用该对象，避免重复制造垃圾对象
	 */
	protected static Result result = new Result();
}
