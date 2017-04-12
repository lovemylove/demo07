package com.springboottest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by wyh on 2017/4/11.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("primaryJdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    @Override
    public void create(String name, Integer age) {
        jdbcTemplate.update("insert into STUDENT(NAME, AGE) values(?, ?)", name, age);
    }
    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("delete from STUDENT where NAME = ?", name);
    }
    @Override
    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("select count(1) from STUDENT", Integer.class);
    }
    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("delete from STUDENT");
    }
}