package com.kris.controllers;

import com.kris.beans.MyTestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 在这里我们使用RestController  （等待于 @Controller 和 @RequestBody）
 */
@RestController
public class HelloController {

	@Autowired
	private MyTestBean myTestBean;

	/**
	 * 在这里我们使用@RequestMapping 建立请求映射:
	 * http://127.0.0.1:8080/hello
	 */
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!!!";
	}

	/**
	 * Spring Boot默认使用的json解析框架是jackson
	 */
	@RequestMapping("/myTestBean")
	public MyTestBean getMyTestBean() {
		myTestBean.setId("007");
		myTestBean.setName("kris");

		return myTestBean;
	}

}
