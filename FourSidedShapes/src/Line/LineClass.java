package Line;

import point.Point;

public class LineClass {

	Point p1;
	Point p2;
	double length;
	double slope;

	public LineClass(Point p1, Point p2) {

		this.p1 = p1;
		this.p2 = p2;
		this.length = findLength();
		this.slope = findSlope();
	}

	public double findLength() {
		double length = p1.distanceTo(p2);
		return length;
	}

	public double findSlope() {

		double y = p1.getY() - p2.getY();
		double x = p1.getX() - p2.getX();
		double slope;

		try {
			slope = y / x;
		} catch (ArithmeticException e) {
			return Double.POSITIVE_INFINITY;
		} catch (Exception e){
			e.printStackTrace();
			return 0;
		}

		return slope;
	}

	/**
	 * @return the p1
	 */
	public Point getP1() {
		return p1;
	}

	/**
	 * @param p1
	 *            the p1 to set
	 */
	public void setP1(Point p1) {
		this.p1 = p1;
	}

	/**
	 * @return the p2
	 */
	public Point getP2() {
		return p2;
	}

	/**
	 * @param p2
	 *            the p2 to set
	 */
	public void setP2(Point p2) {
		this.p2 = p2;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}



	/**
	 * @return the slope
	 */
	public double getSlope() {
		return slope;
	}



}
