package com.tz.spring.dao.impl;

import com.tz.spring.dao.UserDao;
import com.tz.spring.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;

import java.math.BigDecimal;

public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean addMoney(int userId, BigDecimal money) {
        // TODO Auto-generated method stub
        boolean flag = false;
        String sql = "update user set account = account + ? where id=?";
        int rows = this.jdbcTemplate.update(sql, money, userId);
        if (rows > 0) {
            flag = true;
        }
        return flag;
    }

    @Override
    public boolean subMoney(int userId, BigDecimal money) {
        // TODO Auto-generated method stub
        boolean flag = false;
        String sql = "update user set account = account - ? where id=?";
        int rows = this.jdbcTemplate.update(sql, money, userId);
        if (rows > 0) {
            flag = true;
        }
        return flag;
    }

    @Override
    public boolean addUser(User user) {
        // TODO Auto-generated method stub
        boolean flag = false;
        String sql = "insert into user(name, account) values(?, ?)";
        int rows = this.jdbcTemplate.update(sql, user.getName(), user.getAccount());
        if (rows > 0) {
            flag = true;
        }
        return flag;
    }

    @Override
    public BigDecimal getAccount(int fromUserId) {
        // TODO Auto-generated method stub
        String sql = "select account from user where id=?";
        BigDecimal account = this.jdbcTemplate
                .queryForObject(sql, BigDecimal.class, fromUserId);
        return account;
    }

}
