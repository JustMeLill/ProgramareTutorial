package OOPAbstractizareInterfete;

public class Angajat extends Persoana implements InterfaceAngajat {
    public Angajat(String Nume, String Adresa, Integer Varsta) {
        super(Nume, Adresa, Varsta);
    }

    @Override
    public void Munceste(){
        System.out.println("Angajatul munceste.");
    }

    @Override
    public void PrimesteSalariu(){
        System.out.println("Angajatul primeste salariu.");
    }

    @Override
    public void MergeAcasa(){
        System.out.println("Angajatul merge acasa.");
    }

}
