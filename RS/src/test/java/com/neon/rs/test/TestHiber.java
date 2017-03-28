package com.neon.rs.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.neon.rs.domain.User;
import com.neon.rs.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = "classpath:applicationContext.xml")  
public class TestHiber extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private UserService userService;
	
	@Test
	public void testH(){
		User user = new User();
		user.setName("gg");
		user.setSex("女");
		
		userService.save(user);
	}
}
