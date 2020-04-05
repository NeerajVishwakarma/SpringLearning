package org.neeraj.eventhandling.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("eventhandlingspring.xml");
		context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("messages");
		shape.draw();
	}

}
