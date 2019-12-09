package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.atguigu.bean.Person;

/**
 * @author liangqiankun
 * @date 2019年12月7日
 * 
 */
@Configuration
public class MySpringConfigScope {

//	@Scope("prototype")
	@Scope("singleton")
	@Bean("person")
	@Lazy
	public Person person(){
		System.out.println("person创建完成....");
		return new Person();
	}
}
