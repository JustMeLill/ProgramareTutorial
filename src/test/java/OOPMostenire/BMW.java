package OOPMostenire;

import java.util.List;

public class BMW extends Masina {

    public Boolean Semnalizare;

    public BMW (String brand, String model, String transmisie, Integer pret, Boolean Semnalizare) {
        super(brand, model, transmisie, pret);
        this.Semnalizare = Semnalizare;

    }

    public void InfoBMW(){
        InfoMasina();
        System.out.println("Semnalizarea functioneaza? " + Semnalizare);
    }

    //Polimorfismul static - reutilizam aceeasi metoda, insa cu diferiti parametri intre paranterzel rotunde

    public void AfisareMasini(){
        System.out.println("Polimorfism fara parametri");
    }

    public void AfisareMasini(String Valoare){
        System.out.println("Polimorfism cu param string");
    }

    public void AfisareMasini(Integer Valoare){
        System.out.println("Polimorfism cu param Integer");
    }


}
