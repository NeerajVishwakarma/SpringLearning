package org.neeraj.beanpostprocessor.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanpostprocessorspring.xml");
		Triangle triangleByCons = (Triangle) context.getBean("triangle");
		
		triangleByCons.draw();
	}

}
