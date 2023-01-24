package OOPAbstractizareInterfete;

public class AngajatStudent extends Persoana implements InterfaceAngajat, InterfaceStudent{
    public AngajatStudent(String Nume, String Adresa, Integer Varsta){
        super(Nume, Adresa, Varsta);
    }

    @Override
    public void Munceste() {
        System.out.println("Angajatul student munceste");

    }

    @Override
    public void PrimesteSalariu() {
        System.out.println("Angajatul student primeste salariu");
    }

    @Override
    public void MergeAcasa() {
        System.out.println("Angajatul student merge acasa");
    }

    @Override
    public void Invata() {
        System.out.println("Angajatul student invata");
    }

    @Override
    public void PrimesteBursa() {
        System.out.println("Angajatul student primeste bursa");
    }
}
