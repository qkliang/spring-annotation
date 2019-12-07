package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.atguigu.bean.Person;

/**
 * @author liangqiankun
 * @date 2019��12��7��
 * 
 */
@Configuration
public class MySpringConfigScope {

	@Scope("prototype")
	//	@Scope("singleton")
	@Bean("person")
	public Person person(){
		System.out.println("person�������....");
		return new Person();
	}
}
