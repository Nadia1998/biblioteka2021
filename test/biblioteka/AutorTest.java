package biblioteka;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AutorTest {
	Autor a;

	@BeforeEach
	void setUp() throws Exception {
		a=new Autor();
	}

	@AfterEach
	void tearDown() throws Exception {
		a=null;
	}


	@Test
	final void testAutor() {
		a=new Autor();
		assertNotNull(a);
	}

	@Test
	final void testAutorStringString() {
		a=new Autor("Mika","Mikic");
		assertNotNull(a);
		assertEquals("Mika", a.getIme());
		assertEquals("Mikic", a.getPrezime());
	}

	@Test
	final void testGetIme() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testSetPrezime() {
		a.setPrezime("Peric");
		assertEquals("Peric", a.getPrezime());
	}
    @Test void testSetPrezimeNull() {
    	assertThrows(java.lang.NullPointerException.class,()->a.setPrezime(null));
    }
    @Test void setPrezimeKratakString() {
    	assertThrows(java.lang.RuntimeException.class,()->a.setPrezime("P"));
    }
	@Test
	final void testGetPrezime() {
		fail("Not yet implemented"); // TODO
	}

	

	@Test
	final void testToString() {
		a.setIme("Zika");
		a.setPrezime("Zikic");
		String s=a.toString();
		assertTrue(s.contains("Zika"));
		assertTrue(s.contains("Zikic"));
		
	}
	@ParameterizedTest 
	@CsvSource({
		"Pera, Peric, Pera, Peric, true",
		"Pera, Zikic, Pera, Peric, false",
		"Mika, Peric, Pera, Peric, false",
		"Pera, Peric, Mika, Mikic, false"
	})
	void testEqualsObject(String ime1, String prezime1, String ime2, String prezime2, boolean eq) {
		
		a.setIme(ime1);
		a.setPrezime(prezime1);
		
		Autor b=new Autor();
		b.setIme(ime2);
		b.setPrezime(prezime2);
		
	assertEquals(eq, a.equals(b));

	}

	@Test
	@DisplayName("Testiramo ako je uneto null umesto imena")
	void testSetImeNull() {
		assertThrows(java.lang.NullPointerException.class,()->a.setIme(null));
	}
	void setImeKratakString() {
		
			assertThrows(java.lang.RuntimeException.class,()->a.setIme("P"));
		}
	

}
