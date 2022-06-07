package com.tz.spring.service;

import java.math.BigDecimal;

/**
 * 用户转账的服务
 * @author Administrator
 *
 */
public interface UserService {

	public void operateAccount(int fromUserId, int toUserId, BigDecimal money);
	
	public void operateMulAccount(int fromUserId, int toUserId, BigDecimal money);
}
