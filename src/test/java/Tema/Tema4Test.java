package Tema;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Tema4Test {

    @Test

    public void MetodaTest(){

        List <String> InformatiiAlbum1 = Arrays.asList("Sweet Child o' Mine", "Patience", "Don't Cry", "November Rain");

        Tema4 Album1 = new Tema4("Album Studio", "Hard Rock", "Guns N' Roses", 1988, InformatiiAlbum1);
        Album1.InfoAlbum();


        List <String> InformatiiAlbum2 = Arrays.asList("Skinny Little Missy", "San Quentin", "High Time", "Vegas Bomb");

        Tema4 Album2 = new Tema4("Album Studio", "Rock", "Nickelback", 2022, InformatiiAlbum2,true,12.5f);
        Album2.InfoAlbum();

    }
}
