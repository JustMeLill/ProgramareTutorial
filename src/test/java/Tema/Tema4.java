package Tema;

import org.testng.annotations.Test;

import java.util.List;

    public class Tema4 {

    //Clasa Album cu mai multe obiecte (genuri de muzica) - 4-5 obiecte
    //Ex: pret standard, si inca unul pe care il faci cadou, sau cu reducere, etc
    //2-3 constructori si mai multe obiecte


    public String TipAlbum;
    public String GenMuzical;
    public String NumeArtist;
    public Integer AnulAparitiei;
    public List <String> ListaMelodii;
    public Boolean Cadou;
    public Float PretAlbum;

    public Tema4(String tipAlbum, String genMuzical, String numeArtist, Integer anulAparitiei, List<String> listaMelodii) {
        TipAlbum = tipAlbum;
        GenMuzical = genMuzical;
        NumeArtist = numeArtist;
        AnulAparitiei = anulAparitiei;
        ListaMelodii = listaMelodii;
    }

    public Tema4(String tipAlbum, String genMuzical, String numeArtist, Integer anulAparitiei, List<String> listaMelodii, Boolean cadou, Float pretAlbum) {
        TipAlbum = tipAlbum;
        GenMuzical = genMuzical;
        NumeArtist = numeArtist;
        AnulAparitiei = anulAparitiei;
        ListaMelodii = listaMelodii;
        Cadou = cadou;
        PretAlbum = pretAlbum;
    }

    public void InfoAlbum (){
        System.out.println("Tip Album: " + TipAlbum);
        System.out.println("Gen muzical: " + GenMuzical);
        System.out.println("Nume artist: " + NumeArtist);
        System.out.println("Anul aparitiei: " + AnulAparitiei);
        System.out.println("Pe acest album o sa regasiti urmatoarele melodii: ");
        for (Integer index = 0; index < ListaMelodii.size(); index++){
            System.out.println(ListaMelodii.get(index));
        }
        if (Cadou != null && Cadou){
            System.out.println("Pretul albumului este: " + PretAlbum);
        }

    }

}
