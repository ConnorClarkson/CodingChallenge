package shapes;

import Line.LineClass;
import point.Point;

public abstract class Quad {

	// attributes - coordinates as an array
	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;
	private LineClass side1;
	private LineClass side2;
	private LineClass side3;
	private LineClass side4;

	// constructor
	public Quad(Point nPoint1, Point nPoint2, Point nPoint3, Point nPoint4) {
		this.point1 = nPoint1;
		this.point2 = nPoint2;
		this.point3 = nPoint3;
		this.point4 = nPoint4;
		this.side1 = new LineClass(point1, point2);
		this.side2 = new LineClass(point2, point3);
		this.side3 = new LineClass(point3, point4);
		this.side4 = new LineClass(point4, point1);
	}

	// getArea method
	public abstract void getArea();
	public abstract String toString();

	// method to get perimeter
	public double getPerimeter() {
		double perimeter = side1.getLength() + side2.getLength() + side3.getLength() + side4.getLength();

		return perimeter;
	}

	// getters and setters
	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

	public Point getPoint4() {
		return point4;
	}

	public void setPoint4(Point point4) {
		this.point4 = point4;
	}

	public LineClass getSide1() {
		return side1;
	}

	public LineClass getSide2() {
		return side2;
	}

	public LineClass getSide3() {
		return side3;
	}

	public LineClass getSide4() {
		return side4;
	}



}
