package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Quad {
	
	@Test 
	public void testQuad(){
		Quad quad = new Quad((0,0), (10,0), (8,5), (3.3, 5));
		assertNotNull("Object is Null", quad);
	}

	@Test
	public void testQuadArea() {
		Quad quad1 = new Quad((0,0), (10,0), (8,5), (3.3, 5));
		assertEquals(36.75, quad1.getArea());
	}
	
	@Test
	public void testQuadSameValues(){
		Quad quad2 = new Quad((0,0), (0,0), (0,0), (0, 0));
		assertNull(quad2.getArea());
	}
	

	
	
	

}
