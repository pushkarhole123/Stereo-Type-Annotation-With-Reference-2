package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee emp = (Employee) context.getBean("employee");
		
		System.out.println(emp);
		System.out.println(emp.getAddress());
	}
}
