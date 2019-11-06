package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatriceTest {

	@Test
	void testCarre() {
		Calculatrice calc = new Calculatrice();
		assertEquals(0, calc.carre(0));
	}

}
