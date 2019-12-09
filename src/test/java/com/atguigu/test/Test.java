package com.atguigu.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.atguigu.bean.Person;
import com.atguigu.config.MySpringConfig;
import com.atguigu.config.MySpringConfigScope;

/**
 * @author liangqiankun
 * @date 2019年12月6日
 * 
 */
public class Test {
	
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MySpringConfig.class);
	
	@org.junit.Test
	public void test03(){
		String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String property = environment.getProperty("os.name");
		System.out.println(property);
		
		for (String name : beanNamesForType) {
			System.out.println(name);
		}

			
	}
	
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
