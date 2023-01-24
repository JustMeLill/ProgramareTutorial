package OOPAbstractizareInterfete;

public class RestaurantVegan extends Restaurante implements InterfataRestaurantVegan{


    public RestaurantVegan(String denumire, String felPrincipal, Integer numerStele) {
        super(denumire, felPrincipal, numerStele);
    }


    @Override
    public void cresteLegume() {
        System.out.println("Creste legume pentru preparate.");
    }

    @Override
    public void cumparaZarzavat() {
        System.out.println("Cumpara zarzavat pentru uz intern.");
    }

    @Override
    public void preparaLegume() {
        System.out.println("Prepara legumele cu mult drag.");
    }
}
