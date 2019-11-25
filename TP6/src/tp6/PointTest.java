package tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {

	@Test
	void testPerimetre() {
		Point test = new Point(1,2);
		assertEquals(0, test.perimetre());
	}
	
	@Test
	void testSurface() {
		Point test = new Point(0,0);
		assertEquals(0, test.surface());
	}

}
