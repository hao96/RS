package com.neon.rs.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.neon.rs.base.ActionBase;
import com.neon.rs.domain.User;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class TestAction extends ActionBase<User>{

	public String testAction(){
		User user = userservice.getById(1L);
		ActionContext.getContext().put("user", user);
		return SUCCESS;
	}
}
