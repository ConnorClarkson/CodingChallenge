import Line.LineClass;
import point.Point;

public abstract class Quad {
	
	//attributes - coordinates as an array 
	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;
	private double side1;
	private double side2;
	private double side3;
	private double side4;
	
	//constructor
	public Quad(Point nPoint1, Point nPoint2, Point nPoint3, Point nPoint4){
		this.point1 = nPoint1;
		this.point2 = nPoint2;
		this.point3 = nPoint3;
		this.point4 = nPoint4;
		LineClass line1 = new LineClass(point1, point2);
		LineClass line2 = new LineClass(point2, point3);
		LineClass line3 = new LineClass(point3, point4);
		LineClass line4 = new LineClass(point4, point1);
		this.side1 = line1.getLength();
		this.side2 = line2.getLength();
		this.side3 = line3.getLength();
		this.side4 = line4.getLength();
	}
	
	//getArea method
	public abstract void getArea();
	
	//method to get perimeter
	public double getPerimeter(){
		double perimeter = side1+side2+side3+side4;
		return perimeter;
	}
	
	//getters and setters
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
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	public double getSide4() {
		return side4;
	}
	public void setSide4(double side4) {
		this.side4 = side4;
	}
	
	
	
	

}
