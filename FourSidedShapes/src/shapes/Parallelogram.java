package shapes;

import Line.LineClass;
import point.Point;

public class Parallelogram extends Trapezium{

	public Parallelogram(Point nPoint1, Point nPoint2, Point nPoint3, Point nPoint4) throws Exception {
		super(nPoint1, nPoint2, nPoint3, nPoint4);
		if (!Parallelogram.isParallelogram(nPoint1, nPoint2, nPoint3, nPoint4)){
			throw new ShapeException(this.toString(),nPoint1, nPoint2, nPoint3, nPoint4);
		}
		
	}
	
	public static boolean isParallelogram(Point p1, Point p2, Point p3, Point p4){
		LineClass line1 = new LineClass(p1, p2);
		LineClass line2 = new LineClass(p2, p3);
		LineClass line3 = new LineClass(p3, p4);
		LineClass line4 = new LineClass(p4, p1);
		if(line1.getSlope()==line3.getSlope() && line2.getLength()==line4.getLength()){
			return true;
		}
		return false;
	}
	
	public double getArea(){
		double a = this.getSide1().getLength();
		double b = this.getSide4().getLength();
		double c = this.getPoint2().distanceTo(this.getPoint4());
		double cosangle = (a*a+b*b-c*c)/(2*a*b);
		double angle = Math.acos(cosangle);
		double area = a * b * Math.sin(angle);
		return area;
	}
	@Override
	public String toString() {
		return "Parallogram";
	}
}
