package com.atguigu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.bean.Person;
import com.atguigu.config.MySpringConfig;

/**
 * @author liangqiankun
 * @date 2019Äê12ÔÂ6ÈÕ
 * 
 */
public class MainTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MySpringConfig.class);
		Person person = applicationContext.getBean(Person.class);
		System.out.println(person);
	}
}
