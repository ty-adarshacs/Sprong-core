package com.tyss.bean.employ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.spring.bean.School;

public class Emplo_School {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("school.xml");
		 School sc=(School) context.getBean("schoolone");
		 
		 System.out.println(sc.getSname());
		 ((AbstractApplicationContext)context).close();
	}

}
