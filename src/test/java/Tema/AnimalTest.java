package Tema;

import org.testng.annotations.Test;

public class AnimalTest {

    @Test

    public void MetodaTest(){

        System.out.println("==Caine==");

        Animale Caine = new AnimalCaine("Caine", "mers", 4, 20.5f, true);
        Caine.InfoAnimale();
        Caine.ScoateSunet();

        System.out.println(("==Peste=="));

        Animale Peste = new AnimalPeste("Peste", "inot", 0, 10.7f, false);
        Peste.InfoAnimale();
        Peste.ScoateSunet();

    }


}
