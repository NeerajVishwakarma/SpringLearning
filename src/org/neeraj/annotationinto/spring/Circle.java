package org.neeraj.annotationinto.spring;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	private Point point;
	
	@Override
	public void draw() {
		System.out.println("This is a Circle");
		System.out.println("Center of the circle is at : ( "+getPoint().getX()+", "+getPoint().getY()+" )");
	}

	public Point getPoint() {
		return point;
	}

	@Required
	public void setPoint(Point point) {
		this.point = point;
	}

}
