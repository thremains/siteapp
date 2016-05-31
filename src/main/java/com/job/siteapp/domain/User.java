package com.job.siteapp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.job.siteapp.common.globality.BaseEntity;

/**
 * 用户类
 *
 * @author seanwg
 * 2016-5-31 下午08:58:39
 */
@Entity
@Table(name = "site_user",uniqueConstraints={@UniqueConstraint(columnNames={"code"})})
public class User extends BaseEntity implements Serializable {

	private static final long serialVersionUID = -6789976511800473178L;

	/**
	 * 用户名(不可改、不可空、不可重复)
	 */
	@Column(name = "name", updatable = false, nullable = false, unique = true)
	private String name;
	
	/**
	 * 密码
	 */
	@Column(name = "pwd", nullable = false)
	private String pwd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
