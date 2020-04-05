package org.neeraj.interfacespring;

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

	public void setPoint(Point point) {
		this.point = point;
	}

}
