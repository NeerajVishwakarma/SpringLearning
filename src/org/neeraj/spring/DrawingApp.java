package org.neeraj.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
//		Triangle triangle = new Triangle();
		String xml = "spring.xml";
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle-alias");
		triangle.draw();
	}

}
