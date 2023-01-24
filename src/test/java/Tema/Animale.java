package Tema;

public class Animale {

    private String TipAnimal;
    private String MetodaDeplasare;
    private Integer NumarPicioare;
    private Float VitezaDeDeplasare;

    public Animale(String tipAnimal, String metodaDeplasare, Integer numarPicioare, Float vitezaDeDeplasare) {
        TipAnimal = tipAnimal;
        MetodaDeplasare = metodaDeplasare;
        NumarPicioare = numarPicioare;
        VitezaDeDeplasare = vitezaDeDeplasare;
    }

    public String getTipAnimal() {
        return TipAnimal;
    }

    public void setTipAnimal(String tipAnimal) {
        TipAnimal = tipAnimal;
    }

    public String getMetodaDeplasare() {
        return MetodaDeplasare;
    }

    public void setMetodaDeplasare(String metodaDeplasare) {
        MetodaDeplasare = metodaDeplasare;
    }

    public Integer getNumarPicioare() {
        return NumarPicioare;
    }

    public void setNumarPicioare(Integer numarPicioare) {
        NumarPicioare = numarPicioare;
    }

    public Float getVitezaDeDeplasare() {
        return VitezaDeDeplasare;
    }

    public void setVitezaDeDeplasare(Float vitezaDeDeplasare) {
        VitezaDeDeplasare = vitezaDeDeplasare;
    }


    public void InfoAnimale(){
        System.out.println("Animalul este un " + TipAnimal + ".");
        System.out.println("Animalul se deplaseaza prin " + MetodaDeplasare + ".");
        System.out.println("Animalul are " + NumarPicioare + " picioare.");
        System.out.println("Animalul se deplaseaza cu o viteza de " + VitezaDeDeplasare + " km/h.");
    }


    public void ScoateSunet(){
        System.out.println("Animalul scoate sunet");
    }

}
