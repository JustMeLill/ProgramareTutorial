package ValueType;

public class Jucarie {

    public Jucarie(String nume) {
        Nume = nume;
    }

    public String Nume;

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public void Info(){
        System.out.println(Nume);
    }
}
