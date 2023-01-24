package Tema;

public class AnimalPeste extends Animale {

    public Boolean Blana;


    public AnimalPeste(String tipAnimal, String metodaDeplasare, Integer numarPicioare, Float vitezaDeDeplasare, Boolean blana) {
        super(tipAnimal, metodaDeplasare, numarPicioare, vitezaDeDeplasare);
        this.Blana = blana;
    }

    public void ScoateSunet(){
        System.out.println("Animalul nu scoate sunete.");
    }

}
