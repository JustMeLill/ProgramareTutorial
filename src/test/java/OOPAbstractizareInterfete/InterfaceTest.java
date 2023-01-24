package OOPAbstractizareInterfete;

import org.testng.annotations.Test;

public class InterfaceTest {

    @Test
    public void MetodaTest(){
        Angajat Angajat1 = new Angajat("Ionut", "Adresa de test", 40);
        Angajat1.Munceste();
        Angajat1.PrimesteSalariu();
        Angajat1.MergeAcasa();

        Student Student1 = new Student("Delia", "Adresa de test 2", 20);
        Student1.PrimesteBursa();
        Student1.Invata();

        AngajatStudent AngajatStudent1 = new AngajatStudent("Maria", "Adresa de test 3", 21);
        AngajatStudent1.Munceste();
        AngajatStudent1.PrimesteBursa();
    }


}
