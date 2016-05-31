package com.job.siteapp.common.globality.response;

import java.io.Serializable;

/**
 * POST请求统一返回对象
 *
 * @author seanwg
 * 2016-5-31 下午09:09:04
 */
public class Result implements Serializable {
	
	private static final long serialVersionUID = 2657712560200616774L;

	/**
	 * 状态：	0：失败
	 * 		1：成功
	 */
	private Integer status = 0;
	
	/**
	 * 携带消息
	 */
	private String msg;
	
	/**
	 * 携带数据
	 */
	private Object data;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public Result setAll(Integer status, String msg, Object data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
		return this;
	}
}
