package tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CercleTest {

	@Test
	void testPerimetre() {
		Cercle test = new Cercle(1,2,3);
		assertEquals(Math.floor(Math.PI * 2 * test.getRayon()), test.perimetre());
	}
	
	@Test
	void testSurface() {
		Cercle test = new Cercle(1,2,3);
		assertEquals(Math.floor(Math.PI * Math.pow(test.getRayon(), 2)), test.surface());
	}

}
