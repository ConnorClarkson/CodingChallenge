package test;

import static org.junit.Assert.*;

import org.junit.Test;

import point.Point;
import shapes.Rectangle;

public class RectangleTest {

	@Test
	public void test() {
		Point p1=new Point(0,10);
		Point p2=new Point(5,10);
		Point p3=new Point(5,5);
		Point p4=new Point(0,5);
		Rectangle r1=new Rectangle(p1,p2,p3,p4);
		assertNotNull("Not created",r1);
	}

}
