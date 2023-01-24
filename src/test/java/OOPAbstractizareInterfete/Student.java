package OOPAbstractizareInterfete;

public class Student extends Persoana implements InterfaceStudent {


    public Student(String nume, String adresa, Integer varsta) {
        super(nume, adresa, varsta);
    }

    @Override
    public void Invata() {
        System.out.println("Studentul invata.");
    }

    @Override
    public void PrimesteBursa() {
        System.out.println("Studentul primeste bursa.");
    }

    @Override
    public void MergeAcasa() {

    }
}
