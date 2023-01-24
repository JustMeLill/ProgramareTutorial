package OOPAbstractizareInterfete;

public class RestaurantCarne extends Restaurante implements InterfataRestaurantCarne {
    public RestaurantCarne(String denumire, String felPrincipal, Integer numerStele) {
        super(denumire, felPrincipal, numerStele);
    }


    @Override
    public void cumparaCarne() {
        System.out.println("Cumpara carne pentru preparate.");
    }

    @Override
    public void cresteAnimale() {
        System.out.println("Creste animale pentru preparate");
    }

    @Override
    public void preparaAnimale() {
        System.out.println("Prepara carnea pentru gratar.");
    }
}
