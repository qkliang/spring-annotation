package com.atguigu.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.config.MySpringConfig;
import com.atguigu.config.MySpringConfigScope;

/**
 * @author liangqiankun
 * @date 2019年12月6日
 * 
 */
public class Test {
	
	@org.junit.Test
	public void test02(){
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MySpringConfigScope.class);
		System.out.println("Context配置完成.....");
		Object bean = applicationContext.getBean("person");
		
		Object bean2 = applicationContext.getBean("person");
		System.out.println(bean == bean2);
	}
	
	@org.junit.Test
	public void test01(){
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MySpringConfig.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for(String name : beanDefinitionNames){
			System.out.println(name);
		}
	}
}
