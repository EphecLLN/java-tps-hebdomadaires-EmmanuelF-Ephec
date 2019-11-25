package tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarreTest {

	@Test
	void testSurface() {
		Carre test = new Carre(1,2,4);
		assertEquals(16, test.surface());
	}

	@Test
	void testPerimetre() {
		Carre test = new Carre(1,2,4);
		assertEquals(16, test.perimetre());
	}

}
