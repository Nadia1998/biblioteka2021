package biblioteka;

import javax.management.RuntimeErrorException;
/**
 * Klasa koja predstavlja autora knjige
 * 
 * Autor ima ime i prezime kao String vrednosti
 * 
 * @author Nadia1998
 * @version 0.1
 *
 */
public class Autor {
	
	/**
	 * Ime autora kao String.
	 */
	private String ime;
	/**
	 * Prezime autora kao String
	 */
	private String prezime;
	
	/**
	 * Konstruktor koji inicijalizuje objekat i nista vise.
	 */
	public Autor() {
		super();
	}
	/**
	 * Konstruktor koji inicijalizuje objekat i postavlja vrednosti za ime i prezime autora.
	 * 
	 * @param ime Ime autora kao String
	 * @param prezime Prezime autora kao String 
	 */
	Autor(String ime, String prezime){
		super();
		setIme(ime);
		setPrezime(prezime);
	}
	/**
	 * Vraca ime autora 
	 * 
	 * @return Ime autora kao String
	 * 
	 */
	public String getIme() {
		
		return ime;
	}
    /**
    * Postavlja autora na odredjenu vrednost.
    * 
    * @param ime ime autora kao String.
    * 
    * @throws java.lang.NullPointerException ako je uneto ime null
    * 
    * @throws java.lang.RuntimeException ako je uneto ime koje ima manje od dva znaka
    */
	public void setIme(String ime) {
		if(ime==null) {
			throw new NullPointerException();
		}
		if(ime.length()<2)
			throw new RuntimeException("Ime ne moze biti krace od dva karaktera");
		this.ime = ime;
	}
	/**
	 * Vraca prezime autora.
	 * @return vraca prezime kao String.
	 */
	public String getPrezime() {
		return prezime;
	}
	/**
	 * Postavlja prezime autora na odredjenu vrednost.
	 * @param prezime Prezime autora kao String
	 * 
	 * @throws java.lang.NullPointerException ako je prezime null.
	 * @throws java.lang.RuntimeExcpetion ako je uneto prezime krace od 2 karaktera.
	 * 
	 */
	public void setPrezime(String prezime) {
		if(prezime==null) {
			throw new NullPointerException();
		}
			if(prezime.length()<2) {
				throw new RuntimeException("Prezime ne moze biti krace od 2 karaktera");
			}
		
		this.prezime = prezime;
	}
    /**
     * @return Vraca String sa svim podacima o autoru.
     */
	@Override
	public String toString() {
		return "Autor [ime=" + ime + ", prezime=" + prezime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((prezime == null) ? 0 : prezime.hashCode());
		return result;
	}
    /**
     * Poredi 2 autora i vraca true ako su isti, a false ako nisu.
     * Autori se porede po imenu i prezimenu i oba se moraju poklapati.
     * 
     * @return
     * <ul> 
     * <li>Vraca true ako su oba objekta klase Autor i imaju ista imena i prezimena </li> 
     * <li>vraca false u svim ostalim slucajevima </li>
     * </ul>
     */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (prezime == null) {
			if (other.prezime != null)
				return false;
		} else if (!prezime.equals(other.prezime))
			return false;
		return true;
	}
	
	

}
