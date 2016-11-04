package test;
import static org.junit.Assert.*;

import org.junit.Test;

import point.Point;

public class PointTest {

	@Test
	public void testPoint() {
		Point p = new Point(3.5, 2.6);
		assertNotNull("The object is Null", p);
	}
	@Test
	public void testPointGetX(){
		Point p = new Point(2.7, 1.8);
		assertTrue("X is not what was expected", 2.7 == p.getX());
	}
	@Test
	public void testPointGetY(){
		Point p = new Point(2.7, 1.8);
		assertTrue("Y is not what was expected", 1.8 == p.getY());
	}
	@Test
	public void testPointSetX(){
		Point p = new Point(2.7, 1.8);
		p.setX(1.4);
		assertTrue("X was not set", 1.4 == p.getX());
	}
	@Test
	public void testPointSetY(){
		Point p = new Point(2.7, 1.8);
		p.setY(2.9);
		assertTrue("Y was not set", 2.9 == p.getY());
	}
	@Test
	public void testPointToString(){
		Point p = new Point(2.9, 1.5);
		assertTrue("To string not functioning", p.toString().equals("X:2.9, Y:1.5"));
	}
	@Test
	public void testPointDistanceTo1(){
		Point p1 = new Point(2.9, 1.9);
		Point p2 = new Point(1.9, 1.9);
		assertTrue("p1 and p2 aren't that distance", p1.distanceTo(p2) == 1);
	}
	@Test
	public void testPointDistanceTo2(){
		Point p1 = new Point(2.9, 1.9);
		Point p2 = new Point(2.9, 0.9);
		System.out.println(p1.distanceTo(p2));
		assertTrue("p1 and p2 aren't that distance", p1.distanceTo(p2) == 1);
	}
	@Test
	public void testPointDistanceTo3(){
		Point p1 = new Point(2, 5);
		Point p2 = new Point(6,8);
		assertTrue("p1 and p2 aren't that distance", p1.distanceTo(p2) == 5);
	}
	@Test
	public void testPointDistanceTo4(){
		Point p1 = new Point(2, 5);
		Point p2 = new Point(-2, 2);
		System.out.println(p1.distanceTo(p2));
		assertTrue("p1 and p2 aren't that distance", p1.distanceTo(p2) == 5);
	}
	@Test
	public void testPointDistanceTo5(){
		Point p1 = new Point(-6, 1);
		Point p2 = new Point(-2, -2);
		assertTrue("p1 and p2 aren't that distance", p1.distanceTo(p2) == 5);
	}

}
