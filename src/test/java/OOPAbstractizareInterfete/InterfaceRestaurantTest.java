package OOPAbstractizareInterfete;

import org.testng.annotations.Test;

public class InterfaceRestaurantTest {

    @Test
    public void MetodaTest(){

        System.out.println("==Restaurant 1==");
        RestaurantCarne Restaurant1 = new RestaurantCarne("Carnivorul", "Gratar", 0);
        Restaurant1.cumparaCarne();
        Restaurant1.cresteAnimale();
        Restaurant1.preparaAnimale();

        System.out.println("==Restaurant 2==");
        RestaurantVegan Restaurant2 = new RestaurantVegan("Vegetarianul", "Vinete", 1);
        Restaurant2.cresteLegume();
        Restaurant2.cumparaZarzavat();
        Restaurant2.preparaLegume();

        System.out.println("==Restaurant 3==");
        RestaurantMixt Restaurant3 = new RestaurantMixt("DeToate", "Tocana de ciuperci cu pui", 2);
        Restaurant3.cresteAnimale();
        Restaurant3.cresteLegume();
        Restaurant3.cumparaCarne();
        Restaurant3.cumparaZarzavat();
        Restaurant3.preparaAnimale();
        Restaurant3.preparaLegume();

    }
}
