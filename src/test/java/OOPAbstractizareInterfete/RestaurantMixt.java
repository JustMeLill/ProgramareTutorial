package OOPAbstractizareInterfete;

public class RestaurantMixt extends Restaurante implements InterfataRestaurantCarne, InterfataRestaurantVegan{
    public RestaurantMixt(String denumire, String felPrincipal, Integer numerStele) {
        super(denumire, felPrincipal, numerStele);
    }

    @Override
    public void cumparaCarne() {
        System.out.println("Cumpara carne proaspata pentru retete mixte.");
    }

    @Override
    public void cresteAnimale() {
        System.out.println("Creste animale pentru retete mixte.");
    }

    @Override
    public void preparaAnimale() {
        System.out.println("Prepara produse animaliere dar si vegetale.");
    }

    @Override
    public void cresteLegume() {
        System.out.println("Are gradina proprie unde creste legume proaspete de unde hraneste si animalele de la ferma.");
    }

    @Override
    public void cumparaZarzavat() {
        System.out.println("Cumpara zarzavat de la producatori locali.");
    }

    @Override
    public void preparaLegume() {
        System.out.println("Prepara legumele prin fierbere sau le serveste proaspete.");
    }
}
