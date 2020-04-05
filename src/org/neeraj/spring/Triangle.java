package org.neeraj.spring;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	
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

	public String getType() {
		return type;
	}

	/*public void setType(String type) {
		this.type = type;
	}*/

	private String type;
	private int height;
	
	public int getHight() {
		return height;
	}

	public void draw(){
		//System.out.println("This is a Triangle");
		//System.out.println("The type is an "+this.getType()+" Triangle and Height "+getHight());
		
		System.out.println("Point A = { "+pointA.getX()+" , "+pointA.getY()+")");
		System.out.println("Point B = { "+pointB.getX()+" , "+pointB.getY()+")");
		System.out.println("Point C = { "+pointC.getX()+" , "+pointC.getY()+")");
	}

	public Triangle(String type) {
		super();
		this.type = type;
	}
	
	public Triangle() {
	}
	
	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height=height;
	}
}
