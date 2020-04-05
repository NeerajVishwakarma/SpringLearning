package org.neeraj.beandefinitioninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beandefinitioninheritancespring.xml");
		Triangle triangleByCons = (Triangle) context.getBean("triangle2");
		
		triangleByCons.drawList();
	}

}
