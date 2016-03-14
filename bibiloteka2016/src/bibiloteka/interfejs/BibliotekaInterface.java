package bibiloteka.interfejs;

import java.util.LinkedList;

import bibiloteka.Autor;
import bibiloteka.Knjiga;

public interface BibliotekaInterface {

	public void dodajKnjigu(Knjiga knjiga);

	public void obrisiKnjigu(Knjiga knjiga);

	public LinkedList<Knjiga> VratiSveKnjige();

	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac);

}
