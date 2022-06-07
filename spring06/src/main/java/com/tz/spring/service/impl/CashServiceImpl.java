package com.tz.spring.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tz.spring.service.CashService;
import com.tz.spring.service.UserService;

public class CashServiceImpl implements CashService {

	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	@Transactional
	public void operateMulAccount(int fromUserId, int toUserId, List<BigDecimal> accounts) {
		// TODO Auto-generated method stub
		for(BigDecimal bd : accounts){
			userService.operateMulAccount(fromUserId, toUserId, bd);
		}
	}

}

