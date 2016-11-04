package shapes;

import point.Point;

public class Rectangle extends Parallelogram {

	public Rectangle(Point nPoint1, Point nPoint2, Point nPoint3, Point nPoint4){
		super(nPoint1, nPoint2, nPoint3, nPoint4);

		try {
			if (Rectangle.isRectangle(this)) {
			} else {
				throw new ShapeException(this.toString(), nPoint1, nPoint2, nPoint3, nPoint4);
			}

		} catch (ShapeException e) {
			System.out.println(e);
		}
	}

	public static boolean isRectangle(Quad q1) {

		if ((q1.getSide1().getLength() == q1.getSide3().getLength())
				&& (q1.getSide2().getLength() == q1.getSide4().getLength())) {
			if (((Math.pow((q1.getPoint1().distanceTo(q1.getPoint3())), 2)) == ((Math.pow(q1.getSide4().getLength(), 2))
					+ (Math.pow(q1.getSide3().getLength(), 2))))
					&& ((Math.pow((q1.getPoint2().distanceTo(q1.getPoint4())),
							2)) == ((Math.pow(q1.getSide1().getLength(), 2))
									+ (Math.pow(q1.getSide4().getLength(), 2))))
					&& ((Math.pow((q1.getPoint3().distanceTo(q1.getPoint1())),
							2)) == ((Math.pow(q1.getSide3().getLength(), 2))
									+ (Math.pow(q1.getSide1().getLength(), 2))))
					&& ((Math.pow((q1.getPoint4().distanceTo(q1.getPoint2())),
							2)) == ((Math.pow(q1.getSide3().getLength(), 2))
									+ (Math.pow(q1.getSide2().getLength(), 2))))) {
				return true;
			} else
				return false;
		} else
			return false;
	}

	
	public double getArea(){
		double area= this.getSide1().getLength()*this.getSide2().getLength();
		return area;
	}
	
	@Override
	public String toString(){
		return "Rectangle";
	}

}
