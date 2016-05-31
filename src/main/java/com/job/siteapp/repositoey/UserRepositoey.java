package com.job.siteapp.repositoey;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.job.siteapp.domain.User;

/**
 * 用户DAO
 *
 * @author seanwg
 * 2016-5-31 下午08:50:01
 */
@Transactional
public interface UserRepositoey extends JpaRepository<User, String> {

}
