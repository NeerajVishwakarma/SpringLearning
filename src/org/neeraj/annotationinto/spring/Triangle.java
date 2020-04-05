package org.neeraj.annotationinto.spring;

import org.neeraj.annotationinto.spring.Point;

public class Triangle implements Shape{

	Point pointA;
	Point pointB;
	Point pointC;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw(){
		System.out.println("This is a Triangle");
		System.out.println("Point A = ( "+pointA.getX()+","+pointA.getY()+")");
		System.out.println("Point B = ( "+pointB.getX()+","+pointB.getY()+")");
		System.out.println("Point C = ( "+pointC.getX()+","+pointC.getY()+")");
	}
}
