package org.neeraj.messagesource.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("messagesourcespring.xml");
		context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("messages");
		
		shape.draw();
		
//		System.out.println(context.getMessage("greeting", null, "Didnt find a result", null));
	}

}
