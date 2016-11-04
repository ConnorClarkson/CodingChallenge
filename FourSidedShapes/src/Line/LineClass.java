package Line;

public class LineClass {

	double[] p1;
	double[] p2;


	public LineClass(double[] p1, double[] p2) {

		this.p1 = p1;
		this.p2 = p2;

	}

	public double getLength(double[] p1, double[] p2) {

		double xLength = 0;
		double yLength = 0;
		
		
		return 0;
	}

	public int getSlope(LineClass line1, LineClass line2) {
		return 0;

	}

	/**
	 * @return the p1
	 */
	public double[] getP1() {
		return p1;
	}

	/**
	 * @param p1 the p1 to set
	 */
	public void setP1(double[] p1) {
		this.p1 = p1;
	}

	/**
	 * @return the p2
	 */
	public double[] getP2() {
		return p2;
	}

	/**
	 * @param p2 the p2 to set
	 */
	public void setP2(double[] p2) {
		this.p2 = p2;
	}

}
