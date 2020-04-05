package org.neeraj.lifecycle.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecyclespring.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		ApplicationContext contextCustomInit = new ClassPathXmlApplicationContext("lifecyclespring.xml");
		TriangleCustomInit triangleCustomInit = (TriangleCustomInit) contextCustomInit.getBean("triangleCustomInit");
		triangleCustomInit.draw();
	}

}
