package org.neeraj.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingListApp {

	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("listspring.xml");
		Square square = (Square) context.getBean("square");
		
		square.draw();
	}
}
