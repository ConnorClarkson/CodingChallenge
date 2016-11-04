package shapes;

import point.Point;

public class ShapeException extends Exception {
	public ShapeException(String shape, Point nPoint1, Point nPoint2, Point nPoint3, Point nPoint4) {
		super("The following coordinates cannot be used to make a "+ shape+
				": p1" + nPoint1.toString() +" ,p2"  + nPoint2.toString() +" ,p3"  
				+ nPoint3.toString() +" ,p4"  + nPoint4.toString());
		
	}
}
