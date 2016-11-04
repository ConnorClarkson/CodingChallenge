package shapes;

import point.Point;

public class Parallelogram extends Trapezium{

	public Parallelogram(Point nPoint1, Point nPoint2, Point nPoint3, Point nPoint4) throws Exception {
		super(nPoint1, nPoint2, nPoint3, nPoint4);
		if (!Parallelogram.isParallelogram(nPoint1, nPoint2, nPoint3, nPoint4)){
			throw new Exception();
		}
		
	}
	
	public static boolean isParallelogram(Point p1, Point p2, Point p3, Point p4){
		Quad q = new Trapezium(p1, p2, p3, p4);
		if(q.getSide1().getSlope()==q.getSide3().getSlope() && q.getSide1().getLength()==q.getSide3().getLength()){
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

}
