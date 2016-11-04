package shapes;

import point.Point;

public class Trapezium extends Quad{
	double longBase, shortBase, slatingSide1, slantingSide1;
	
	public Trapezium(Point nPoint1, Point nPoint2, Point nPoint3, Point nPoint4) {
		super(nPoint1, nPoint2, nPoint3, nPoint4);
		
		
		try {
			if (isTrapezium(this)){
				
			}
			else {
				throw new ShapeException(this.toString(),nPoint1, nPoint2, nPoint3, nPoint4);
			}
			
			
		} catch (ShapeException e){
			System.out.println(e);
		}
		// TODO Auto-generated constructor stub
	}


	
	public static Boolean isTrapezium(Quad shape) {
		
		if ((shape.getSide1().findSlope() == shape.getSide3().findSlope()) || (shape.getSide2().findSlope() == shape.getSide4().findSlope()) ){
			
			return true;
		}
		
		return false;
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Trapizium";
	}
	
}
