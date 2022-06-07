package com.tz.spring.service;

import java.math.BigDecimal;
import java.util.List;

/**
 * A用户到B用户多次转账
 * @author Administrator
 *
 */
public interface CashService {

	public void operateMulAccount(int fromUserId, int toUserId, List<BigDecimal> accounts);
}
