package test;

import static org.junit.Assert.*;

import org.junit.Test;

import point.Point;
import shapes.Parallelogram;
import shapes.Rectangle;

public class RectangleTest {

	@Test
	public void test() throws Exception {
		Point p1=new Point(0,10);
		Point p2=new Point(5,10);
		Point p3=new Point(5,5);
		Point p4=new Point(0,5);
		Rectangle r1=new Rectangle(p1,p2,p3,p4);
		assertNotNull("Not created",r1);
	}
	@Test
	public void testIsRectangle(){
		Point p1 = new Point(0, 0);
		Point p2 = new Point(5, 5);
		Point p3 = new Point(10, 5);
		Point p4 = new Point(5, 0);
		Rectangle r2;
		try {
			r2 = new Rectangle(p1,p2,p3,p4);
			boolean b = Rectangle.isRectangle(r2);
			assertTrue("Points don't make a rectangle", b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
