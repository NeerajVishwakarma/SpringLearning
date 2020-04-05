package org.neeraj.spring;

import java.util.List;

public class Square {

	List<Point> points;
	
	public void draw(){
		for(Point point:points){
			System.out.println("Points are = { "+point.getX()+" , "+point.getY()+")");
		}
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
}
