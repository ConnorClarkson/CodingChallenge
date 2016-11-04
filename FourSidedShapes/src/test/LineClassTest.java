package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Line.LineClass;
import point.Point;

public class LineClassTest {
	Point p1 = new Point(10, 5);
	Point p2 = new Point(15, 5);
	@Test
	public void testLineClass() {
		
		LineClass line = new LineClass(p1,p2);
		assertNotNull("is Null",line);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetLenght(){
		
		LineClass line = new LineClass(p1, p2);
		assertEquals(5, line.getLength());
		
	
	}

	public void testGetSlope(){
		LineClass line = new LineClass(p1,p2);
		LineClass line1 = new LineClass(p1,p2);
		assertEquals(0, line.getSlope());
		
	}

	
	
}
