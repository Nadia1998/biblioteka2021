package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;
/**
 * Interfejs koji implementira biblioteku
 * @author Nadia
 *
 */
public interface BibliotekaInterfejs {
	/**
	 * Dodaje novu knjigu u biblioteku
	 * 
	 * @param knjiga Knjiga koja se dodaje
	 * 
	 * @throws java.lang.NullPointerException ako je uneta knjiga Null
	 * 
	 * @throws java.lang.RuntimeException ako je uneta knjiga duplikat
	 * 
	 */
	public void dodajKnjigu(Knjiga knjiga);
	
	public void obrisiKnjigu(Knjiga knjiga);
	
	public LinkedList<Knjiga> vratiSveKnjige();
	
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String isbn,String naslov , String izdavac);
	
	

}
