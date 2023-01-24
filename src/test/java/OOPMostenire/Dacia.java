package OOPMostenire;

import java.util.List;

public class Dacia extends Masina {

    private String Culoare;
    private List<String> DotariExterioare;


    public Dacia(String brand, String model, String transmisie, Integer pret, String Culoare, List<String> DotariExterioare) {
        //super = apeleaza constructorul din clasa parinte
        super(brand, model, transmisie, pret);
        this.Culoare = Culoare;
        this.DotariExterioare = DotariExterioare;

    }

    public String getCuloare() {
        return Culoare;
    }

    public void setCuloare(String culoare) {
        Culoare = culoare;
    }

    public List<String> getDotariExterioare() {
        return DotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        DotariExterioare = dotariExterioare;
    }

    public void InfoDacia(){
        InfoMasina();
        System.out.println("Culoare masinii este: " + Culoare);
        System.out.println("Dotarile exterioare ale masinii sunt: " + DotariExterioare);

    }

    public void CalculPretFinal(){
        Integer PretFinal;

        if(Culoare.contains("Metalizat")) {
            PretFinal = getPret() + 500;

    }   else {
            PretFinal = getPret() + 200;
            }

        //Calculam pretul pe baza dotarilor
        for (String Dotare : DotariExterioare){
            switch (Dotare){
                case "Geamuri electrice":
                    PretFinal = getPret() + 700;
                    break;
                case "Aer conditionat":
                    PretFinal = getPret() + 800;
                    break;
            }
        }

            System.out.println("Pretul final al masinii este: " + getPret());

    }

    //Suprascriu metoda din parinte utilizand polimorfismul dinamic

    public void ConducMasina(){
        System.out.println("Dacia se conduce cu volan pe stanga.");
        //Daca vrem sa chemam si metoda din parinte, folosim ""super"
        super.ConducMasina();
    }




}



