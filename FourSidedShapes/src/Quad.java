
public abstract class Quad {
	
	//attributes - coordinates as an array 
	private double[] point1 = new double[2];
	private double[] point2 = new double[2];
	private double[] point3 = new double[2];
	private double[] point4 = new double[2];
	private double side1;
	private double side2;
	private double side3;
	private double side4;
	
	//constructor
	public Quad(double[] nPoint1, double[] nPoint2, double[] nPoint3, double[] nPoint4){
		this.point1 = nPoint1;
		this.point2 = nPoint2;
		this.point3 = nPoint3;
		this.point4 = nPoint4;
		Line line1 = new Line(point1, point2);
		Line line2 = new Line(point2, point3);
		Line line3 = new Line(point3, point4);
		Line line4 = new Line(point4, point1);
		this.side1 = line1.getLength();
		this.side2 = line2.getLength();
		this.side3 = line3.getLength();
		this.side4 = line4.getLength();

		
	}
	
	//method to get perimeter
	public double getPerimeter{
		
		double A = line1.getLength();
		double B = line2.getLength();
		double C = line3.getLength();
		double D = line4.getLength();
		double perimeter = A+B+C+D;
	}
	
	//getters and setters
	public double[] getPoint1() {
		return point1;
	}
	public void setPoint1(double[] point1) {
		this.point1 = point1;
	}
	public double[] getPoint2() {
		return point2;
	}
	public void setPoint2(double[] point2) {
		this.point2 = point2;
	}
	public double[] getPoint3() {
		return point3;
	}
	public void setPoint3(double[] point3) {
		this.point3 = point3;
	}
	public double[] getPoint4() {
		return point4;
	}
	public void setPoint4(double[] point4) {
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
