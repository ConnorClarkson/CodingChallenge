package shapes;

import point.Point;

public class Trapezium extends Quad {
	double longBase, shortBase, slatingSide1, slantingSide1;

	public Trapezium(Point nPoint1, Point nPoint2, Point nPoint3, Point nPoint4) {
		super(nPoint1, nPoint2, nPoint3, nPoint4);

		try {
			if (isTrapezium(this)) {
				calculateFourSides();
			} else {
				throw new ShapeException(this.toString(), nPoint1, nPoint2, nPoint3, nPoint4);
			}

		} catch (ShapeException e) {
			System.out.println(e);
		}

	}

	public static Boolean isTrapezium(Quad shape) {

		if (((shape.getSide1().findSlope() == shape.getSide3().findSlope())
				|| (shape.getSide2().findSlope() == shape.getSide4().findSlope()))
				/*|| !(shape.getSide1().findSlope() == shape.getSide3().findSlope())
						&& (shape.getSide2().findSlope() == shape.getSide4().findSlope())*/) {
			return true;
		}

		return false;
	}

	public void calculateFourSides() {
		Quad shape = this;
		
		if(shape.getSide1().findSlope() == shape.getSide3().findSlope()){
			if(shape.getSide1().findLength() > shape.getSide3().findLength()){
				this.longBase = shape.getSide1().findLength();
				this.shortBase = shape.getSide3().findLength();
			}
			else {
				this.shortBase = shape.getSide1().findLength();
				this.longBase = shape.getSide3().findLength();
			}
				
		}else if (shape.getSide2().findSlope() == shape.getSide4().findSlope()){
			if(shape.getSide2().findLength() > shape.getSide4().findLength()){
				this.longBase = shape.getSide2().findLength();
				this.shortBase = shape.getSide4().findLength();
			}
			else {
				this.shortBase = shape.getSide2().findLength();
				this.longBase = shape.getSide4().findLength();
			}
		}
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Trapizium";
	}

}
