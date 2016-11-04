package shapes;

import Line.LineClass;
import point.Point;

public class Square extends Rectangle {

	public Square(Point nPoint1, Point nPoint2, Point nPoint3, Point nPoint4) {
		super(nPoint1, nPoint2, nPoint3, nPoint4);
		try {
			if (!Square.isSquare(nPoint1, nPoint2, nPoint3, nPoint4)) {
				throw new ShapeException(this.toString(), nPoint1, nPoint2, nPoint3, nPoint4);
			}
		} catch (ShapeException se) {

		}
	}

	public static boolean isSquare(Point p1, Point p2, Point p3, Point p4) {
		LineClass line1 = new LineClass(p1, p2);
		System.out.println(line1.getLength());
		LineClass line2 = new LineClass(p2, p3);
		System.out.println(line2.getLength());
		LineClass line3 = new LineClass(p3, p4);
		System.out.println(line3.getLength());
		LineClass line4 = new LineClass(p4, p1);
		System.out.println(line4.getLength());
		LineClass[] lines = { line1, line2, line3, line4 };
		if (line1.getLength() == line2.getLength() && line1.getLength() == line3.getLength()
				&& line1.getLength() == line4.getLength()) {
			return true;
		}
		return false;
	}

	public double getArea() {
		return this.getSide1().getLength() * this.getSide1().getLength();
	}

	@Override
	public String toString() {
		return "Square";
	}

}
