package org.neeraj.eventhandling.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;


public class Circle implements Shape, ApplicationEventPublisherAware {

	private Point center;
	
	private ApplicationEventPublisher publisher;

	@Override
	public void draw() {
		System.out.println("This is a Circle");
		System.out.println("Center of the circle is at : ( "+getcenter().getX()+", "+getcenter().getY()+" )");
		DrawEvent draw = new DrawEvent(this);
		publisher.publishEvent(draw);
	}

	public Point getcenter() {
		return center;
	}

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

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}
}
