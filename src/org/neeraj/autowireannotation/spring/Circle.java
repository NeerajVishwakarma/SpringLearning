package org.neeraj.autowireannotation.spring;

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

	public void setcenter(Point center) {
		this.center = center;
	}

}
