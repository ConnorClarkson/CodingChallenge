package test;
import static org.junit.Assert.*;

import org.junit.Test;

import point.Point;
import shapes.Parallelogram;



public class ParallelogramTest {

	@Test
	public void testParallelogram() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(5, 5);
		Point p3 = new Point(10, 5);
		Point p4 = new Point(5, 0);
		Parallelogram para1;
		try {
			para1 = new Parallelogram(p1, p2, p3, p4);
			assertNotNull("Not created", para1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIsParallelogram(){
		Point p1 = new Point(0, 0);
		Point p2 = new Point(5, 5);
		Point p3 = new Point(10, 5);
		Point p4 = new Point(5, 0);
		boolean b = Parallelogram.isParallelogram(p1, p2, p3, p4);
		assertTrue("Points don't make a parallelogram", b);
	}
	
	@Test
	public void testIsNotParallelogram(){
		Point p1 = new Point(0, 0);
		Point p2 = new Point(5, 5);
		Point p3 = new Point(10, 7);
		Point p4 = new Point(5, 0);
		boolean b = Parallelogram.isParallelogram(p1, p2, p3, p4);
		assertFalse("Points do make a parallelogram", b);
	}
	
	@Test
	public void testParallelogramArea(){
		Point p1 = new Point(0, 0);
		Point p2 = new Point(5, 5);
		Point p3 = new Point(10, 5);
		Point p4 = new Point(5, 0);
		Parallelogram para1;
		try {
			para1 = new Parallelogram(p1, p2, p3, p4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		para1.getArea();
	}
	

}
