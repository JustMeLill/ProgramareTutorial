package OOPMostenire;

public class Masina {

    //OOP = Object Oriented Programming
    //Patru concepte = Mostenire, Abstractizare, Incapsulare, Polimorfism
    //Mostenire = conceptul prin care o clasa mosteneste o alta clasa (nepoti => bunici)
    //Clasa care mosteneste (nepotii) se numeste clasa copil
    //Care este mostenita (bunicii) se numeste clasa parinte
    //Mostenirea se face cu cuvantul "extends"
    //In JAVA o clasa poate sa mosteneasca o singura clasa
    //In momentul in care o clasa mosteneste o alta clasa => trebuie sa apelam prima data constructorul din parinte
    //In momentul in care o clasa mosteneste o alta clasa => putem accesa orice variabila/metoda din clasa parinte


    //Aplicam conceptul de incapsulare a datelor.
    //Incapsularea datelor = conceptul prin care tinem departe de exterior valorile variabilelor pe care nu vrem sa le modificam. Ex: Pretul masinii.

    //"private" = access control care restrictioneaza vizibilitatea variabilei la nivel de clasa unde a fost declarata
    //Ca sa accesam / modificam valorile unor variabile private new folosim de conceptul "get" si "set"

    //Polimorfism = conceptul prin care o metoda poate avea mai multe forme
    //Polimorfismul este de 2 feluri - dinamic (override) si static (overload)
    //Polimorifismul dinamic (override) = intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea mai multe implementari
    //Polimorfismul dinamic se aplica mereu cu mostenirea
    //Polimorifismul static (overflow) = o metoda sa poate diferentia prin numarul sau tipul parametrilor

    private String Brand;
    private String Model;
    private String Transmisie;
    private Integer Pret;

    public Masina(String brand, String model, String transmisie, Integer pret) {
        Brand = brand;
        Model = model;
        Transmisie = transmisie;
        Pret = pret;
    }

    //Introducem GET si SET


    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public String getTransmisie() {
        return Transmisie;
    }

    public Integer getPret() {
        return Pret;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setTransmisie(String transmisie) {
        Transmisie = transmisie;
    }

    public void InfoMasina(){
        System.out.println("Brandul masinii este: " + Brand);
        System.out.println("Modelul masinii este:" + Model);
        System.out.println("Transmisia masinii este: " + Transmisie);
        System.out.println("Pretul masinii este: " + Pret);
    }

    //Polimorfismul dinamic asa cum este el definit in parinte (o sa il refolosim dinamic in Dacia si Audi)

    public void ConducMasina(){
        System.out.println("Masina se poate conduce");
    }




}
