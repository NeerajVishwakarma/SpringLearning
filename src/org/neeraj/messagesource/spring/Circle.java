package org.neeraj.messagesource.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.MessageSource;


public class Circle implements Shape {

	private Point center;
	private MessageSource messagesour;


	public void setMessagesour(MessageSource messagesour) {
		this.messagesour = messagesour;
	}

	@Override
	public void draw() {
		System.out.println("This is a Circle");
		System.out.println(this.messagesour.getMessage("center.points", new Object[] {center.getX(), center.getY()}, "Didnt find a result", null));
		System.out.println(this.messagesour.getMessage("greeting", null, "Didnt find a result", null));
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
}
