package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Line.LineClass;

public class LineClassTest {
	double[] p1 = {10.0,5.0};
	double[] p2 = {15.0,5.0};
	@Test
	public void testLineClass() {
		
		LineClass line = new LineClass(p1,p2);
		assertNotNull("is Null",line);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetLenght(){
		
		LineClass line = new LineClass(p1, p2);
		assertEquals(5, line.getLength(p1, p2));
		
	
	}

	public void testGetSlope(){
		LineClass line = new LineClass(p1,p2);
		LineClass line1 = new LineClass(p1,p2);
		assertEquals(0, line.getSlope(line, line1));
		
	}

	
	
}
