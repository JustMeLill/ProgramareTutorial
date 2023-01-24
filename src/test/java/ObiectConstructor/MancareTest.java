package ObiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class MancareTest {

    @Test

    public void MetodaTest () {
        //Declaram un obiect de tipul X

        List <String> IngredienteSupaPui = Arrays.asList("apa", "morcovi", "pui", "taietei");

        Mancare SupaPui = new Mancare("Supa de Pui", "Supa de casa", IngredienteSupaPui, 300);
        SupaPui.InfoMancare();


        List <String> IngredienteSarmale = Arrays.asList("carne", "varza", "sare", "orez");

        Mancare Sarmale = new Mancare("Sarmale", "Traditionale", IngredienteSarmale, 1000);
        Sarmale.InfoMancare();


        List <String> IngredienteSarmalePost = Arrays.asList("ciuperci", "varza", "sare", "orez");

        Mancare SarmalePost = new Mancare("SarmalePost", "TraditionalePost", IngredienteSarmalePost, 400, true);
        SarmalePost.InfoMancare();

    }
}






