package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import com.atguigu.bean.Person;

/**
 * @author liangqiankun
 * @date 2019Äê12ÔÂ6ÈÕ
 * 
 */
@Configuration
//@ComponentScan(value="com.atguigu",excludeFilters={
//		@Filter(type=FilterType.ANNOTATION,classes={Controller.class,Service.class})
//})
@ComponentScan(value="com.atguigu",includeFilters={
//		@Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
//		@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class}),
		@Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})
},useDefaultFilters = false)
public class MySpringConfig {
	
	@Bean(value="person")
	public Person person(){
		return new Person("ss",21);
	}
}
