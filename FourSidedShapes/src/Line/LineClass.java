package Line;

public class LineClass {

	double[] p1;
	double[] p2;
	double length;
	int slope;

	public LineClass(double[] p1, double[] p2) {

		this.p1 = p1;
		this.p2 = p2;
		this.length = findLength();
		this.slope = findSlope();
	}

	
	public double findLength(){
		double length=0;
		
		return length; 
	}
	public int findSlope(){
		int slope=0;
		
		return slope;
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

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the slope
	 */
	public int getSlope() {
		return slope;
	}

	/**
	 * @param slope the slope to set
	 */
	public void setSlope(int slope) {
		this.slope = slope;
	}


	
}
