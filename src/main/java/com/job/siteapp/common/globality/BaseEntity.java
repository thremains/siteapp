package com.job.siteapp.common.globality;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Date;

/**
 * Entity 基类，所以子类自动获得id，创建时间、更新时间
 */
@MappedSuperclass
public class BaseEntity implements Serializable{

	private static final long serialVersionUID = -8438364796997007005L;

	/**
	 * 记录主键
	 */
	@Id
	@GenericGenerator(name="idGenerator", strategy="uuid") //这个是hibernate的注解
	@GeneratedValue(generator="idGenerator") //使用uuid的生成策略
	@Column(name = "code")
    private String code;

	@Column(name = "create_time", updatable = false)
    private Date createTime;

    @Column(name = "modify_time")
    private Date modifyTime;

    @PrePersist
    public void preCreate() {
        Date now = new Date();
        createTime = now;
        modifyTime = now;
    }
    
    @PreUpdate
    public void preUpdate() {
    	modifyTime = new Date();
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
    
}
