package shapes;

import Line.LineClass;
import point.Point;

public class Square extends Rectangle {

	public Square(Point nPoint1, Point nPoint2, Point nPoint3, Point nPoint4){
		super(nPoint1, nPoint2, nPoint3, nPoint4);
		// TODO Auto-generated constructor stub
	}
	
	public static boolean isSquare(Point p1, Point p2, Point p3, Point p4){
		LineClass line1 = new LineClass(p1, p2);
		LineClass line2 = new LineClass(p2, p3);
		LineClass line3 = new LineClass(p3, p4);
		LineClass line4 = new LineClass(p4, p1);
		LineClass[] lines = {line1, line2, line3, line4};
		boolean b = true;
		for (LineClass l: lines){
			for (LineClass l2: lines){
				if (!(l.getLength() == l2.getLength())){
					b = false;
				}
			}
		}
		return b;
	}
	

}
