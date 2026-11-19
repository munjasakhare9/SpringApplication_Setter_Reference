package com.demo.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Student;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student s1 = context.getBean("s1", Student.class);
		System.out.println(s1);
	}
}
