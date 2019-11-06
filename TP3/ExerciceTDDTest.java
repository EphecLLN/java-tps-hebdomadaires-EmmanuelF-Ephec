package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExerciceTDDTest {

	@Test
	void testEstPair() {
		ExerciceTDD test = new ExerciceTDD();
		assertEquals(false, test.estPair(3));
	}

	@Test
	void testPerimetreCarre() {
		ExerciceTDD test = new ExerciceTDD();
		assertEquals(24, test.perimetreCarre(6));
	}

	@Test
	void testContientCaractere() {
		ExerciceTDD test = new ExerciceTDD();
		assertEquals(true, test.contientCaractere('z', ""));
	}

}
