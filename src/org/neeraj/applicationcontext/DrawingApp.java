package org.neeraj.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appcontextspring.xml");
		Triangle triangleByCons = (Triangle) context.getBean("triangleByName");
		
		triangleByCons.draw();
	}

}
