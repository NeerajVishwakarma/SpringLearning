package org.neeraj.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowirespring.xml");
		Triangle triangleByName = (Triangle) context.getBean("triangleByName");
		Triangle triangleByCons = (Triangle) context.getBean("triangleByCons");
		
		triangleByCons.draw();
	}

}
