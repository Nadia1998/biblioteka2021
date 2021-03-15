package biblioteka.interfejs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import biblioteka.Knjiga;

public abstract class TestBibliotekaInterfejs {
	protected BibliotekaInterfejs biblioteka;

	@Test
	 void testDodajKnjigu() {
		Knjiga k=new Knjiga();
		k.setNaslov("Knjiga 1");
		
		biblioteka.dodajKnjigu(k);
		
		assertEquals(k, biblioteka.vratiSveKnjige().get(0));
		
	}

}
