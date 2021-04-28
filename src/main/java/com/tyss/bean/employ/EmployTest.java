package com.tyss.bean.employ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.spring.bean.Employ;

public class EmployTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employ emp=(Employ) context.getBean("empone");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		
		
	}

}
