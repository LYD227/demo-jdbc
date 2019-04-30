package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.quartz.QuartzProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public void register(String userName,String password) {
        String sql ="insert into user (userName,password) value(?,?)";
        jdbcTemplate.update(sql,userName,password);
    }
}
