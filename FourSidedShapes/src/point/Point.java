package point;

/**
 * @author Administrator
 *
 */
public class Point {

	private double x;
	private double y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString(){
		String string = "X:" +this.getX() + ", Y:" +this.getY();
		return string;
	}
	
	public double distanceTo(Point p){
		double xdiff = this.getX()-p.getX();
		double ydiff = this.getY()-p.getY();
		double pythag = xdiff*xdiff + ydiff*ydiff;
		double length = Math.sqrt(pythag);
		return length;
	}
}

