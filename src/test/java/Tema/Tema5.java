package Tema;

import java.util.List;

public class Tema5 {

    //Inca un exemplu similar cu cel din telefon, insa pentru carti, cu diferite scenarii.

    public String Categorie;
    public Integer AnulAparitiei;
    public String NumeAutor;
    public String NumeEditura;
    public List <String> ListaCapitole;
    public Boolean eBook;
    public Double Pret;

    public Tema5(String categorie, Integer anulAparitiei, String numeAutor, String numeEditura, List<String> listaCapitole) {
        Categorie = categorie;
        AnulAparitiei = anulAparitiei;
        NumeAutor = numeAutor;
        NumeEditura = numeEditura;
        ListaCapitole = listaCapitole;
    }

    public Tema5(String categorie, Integer anulAparitiei, String numeAutor, String numeEditura, List<String> listaCapitole, Boolean eBook, Double pret) {
        Categorie = categorie;
        AnulAparitiei = anulAparitiei;
        NumeAutor = numeAutor;
        NumeEditura = numeEditura;
        ListaCapitole = listaCapitole;
        this.eBook = eBook;
        Pret = pret;
    }

    public void InfoCarte(){
        System.out.println("Cartea face parte din categoria: " + Categorie);
        System.out.println("Cartea a fost publicata in anul: " + AnulAparitiei);
        System.out.println("Numele autorului este: " + NumeAutor);
        System.out.println("Cartea a fost publicata de Editura: " + NumeEditura);
        System.out.println("Cartea are urmatoarele capitole: " + ListaCapitole);
    }

    public void VechimeCarte(){
        if (AnulAparitiei >= 2019){
            System.out.println("Cartea se poate clasifica in categoria Noutati.");
        }

        if (AnulAparitiei >= 2001 && AnulAparitiei < 2019){
            System.out.println("Cartea se poate clasifica in categoria Aproape Noi.");
        }

        if (AnulAparitiei < 2000) {
            System.out.println("Cartea se poate clasifica in categoria Carti Vechi.");
        }
    }

    public void Diverse(){
        if (AnulAparitiei <= 2019 && eBook != null){
            System.out.println("Cartea este prea veche si se poate citi doar in format eBook.");
        }
    }
}
