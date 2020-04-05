package org.neeraj.jsr250.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {

	private Point center;
	
	@Override
	public void draw() {
		System.out.println("This is a Circle");
		System.out.println("Center of the circle is at : ( "+getcenter().getX()+", "+getcenter().getY()+" )");
	}

	public Point getcenter() {
		return center;
	}

	@Resource
	public void setcenter(Point center) {
		this.center = center;
	}

	@PostConstruct
	public void InitializeCentre(){
		System.out.println("Initialization of centre is completed");
	}
	
	@PreDestroy
	public void destroyCentre(){
		System.out.println("Distroy of centre is complete.");
	}
}
