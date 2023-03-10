package AbstractizareClasa;

public abstract class Persoana {

    //O clasa abstracta poate sau nu sa contina metode abstracte
    //Clasa care mosteneste clasa abstracta => implementeaza toate metodele abstracte
    //Putem mosteni o singura clasa abstracta
    //O clasa abstracta poate implementa o interfata
    //Intr-o clasa abstracta poti avea un constructor, insa nu putem face un obiect
    //Intr-o clasa abstracta putem avea metode private, public, si protected.
    //Metodele abstracte trebuie sa contina cuvantul "abstract"


    //Definim metode abstracte
    public abstract void munceste();
    public abstract void primesteSalariu();
    public abstract void mergeLaCurs();
    public abstract void primesteBursa();

    //Definim o metoda simpla
    public void curs(){
        System.out.println("Asta este o metoda normala.");
    }



}
