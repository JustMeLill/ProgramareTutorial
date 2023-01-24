package ObiectConstructor;

import java.util.List;

public class Telefon {

    public String Brand;
    public String Model;
    public Integer AnFabricatie;
    public String SystemOperare;
    public List<String> Caracteristici;
    public Double Pret;

    public Telefon(String brand, String model, Integer anFabricatie, String systemOperare, List<String> caracteristici) {
        Brand = brand;
        Model = model;
        AnFabricatie = anFabricatie;
        SystemOperare = systemOperare;
        Caracteristici = caracteristici;
    }

    public Telefon(String brand, String model, Integer anFabricatie, String systemOperare, List<String> caracteristici, Double pret) {
        Brand = brand;
        Model = model;
        AnFabricatie = anFabricatie;
        SystemOperare = systemOperare;
        Caracteristici = caracteristici;
        Pret = pret;
    }

    public void VechimeTelefon(){
        if (AnFabricatie >= 2020){
            System.out.println("Telefonul este considerat aproape nou.");
        }

        if (AnFabricatie >= 2015 && AnFabricatie <= 2019){
            System.out.println("Telefonul este usor invechit.");
        }

        if (AnFabricatie < 2015) {
            System.out.println("Telefonul este prea vechi");
        }

    }

    public void PretTelefon(){
        if (Pret != null){
            System.out.println(Pret);
        }
        else {
            System.out.println("Telefonul este de prezentare.");
        }
    }


    public void DiscountTelefon(Double Reducere){

        if (Pret != null){
            Double Diferenta = (Pret * Reducere)/100;
            Double PretNou = (Pret - Diferenta);
            System.out.println("Noul pret al telefonului este: " + PretNou);
        }
        else {
            System.out.println("Telefonul este de prezentare.");
        }

    }
}
