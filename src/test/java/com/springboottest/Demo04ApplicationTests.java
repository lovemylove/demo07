package com.springboottest;

import com.springboottest.domain.p.User;
import com.springboottest.domain.p.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.sql.DataSource;

/**
 * 测试通过两个jdbcTemplate进行数据的处理
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Demo03Application.class)
@WebAppConfiguration
public class Demo04ApplicationTests {
	@Autowired
	@Qualifier("secondaryDataSource")
	private DataSource dataSource;
	@Autowired
	private UserRepository userRepository;
	@Test
	public void contextLoads() {
		User user=new User();
		user.setAge(24);
		user.setName("张三");
		userRepository.save(user);

	}

}
