package Tema;

import ObiectConstructor.Telefon;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Tema5Test {

    @Test
        public void MetodaTest(){

        List<String> Carte1 = Arrays.asList("Capitolul 1", "Capitolul 2", "Capitolul 3");
        Tema5 PacientaTacuta = new Tema5("Fictiune", 2019, "Alex Michaelides",  "Litera", Carte1);
        PacientaTacuta.InfoCarte();
        PacientaTacuta.VechimeCarte();


        List<String> Carte2 = Arrays.asList("Capitolul 1a", "Capitolul 2a", "Capitolul 3a");
        Tema5 Test2 = new Tema5("Politiste", 1987, "Agatha Cristie", "Litera", Carte1, true, 19.5);
        Test2.InfoCarte();
        Test2.VechimeCarte();
        Test2.Diverse();

    }


}
