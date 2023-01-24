package Tema;

public class AnimalCaine extends Animale {

    public Boolean Blana;

    public AnimalCaine(String tipAnimal, String metodaDeplasare, Integer numarPicioare, Float vitezaDeDeplasare, Boolean blana) {
        super(tipAnimal, metodaDeplasare, numarPicioare, vitezaDeDeplasare);
        this.Blana = blana;
    }

   public void ScoateSunet(){
       System.out.println("Animalul latra.");
   }

}
