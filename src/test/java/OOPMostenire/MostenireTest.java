package OOPMostenire;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class MostenireTest {
    @Test
    //Facem un obiect de tip "Dacia"

    public void MetodaTest(){

        System.out.println("==obiecteDacia");

        List<String> DotariExtLogan = Arrays.asList("Geamuri electrice", "Aer conditionat");
        Dacia Logan = new Dacia("Dacia", "Logan", "manuala", 10000, "Alb Metalizat", DotariExtLogan);
        Logan.InfoDacia();
        Logan.CalculPretFinal();
        Logan.ConducMasina();

        List<String> DotariExtSandero = Arrays.asList("Geamuri electrice", "Aer conditionat");
        Dacia Sandero = new Dacia("Dacia", "Sandero", "manuala", 1500, "Alb", DotariExtSandero);
        Sandero.InfoDacia();
        Sandero.CalculPretFinal();

        List<String> DotariExtDokker = Arrays.asList("Geamuri electrice", "Aer conditionat");
        Dacia Dokker = new Dacia("Dacia", "Dokker", "manuala", 2000, "alb", DotariExtDokker);
        Dokker.InfoDacia();

        System.out.println("==obiecteAudi");
        List<String> DotariExtAudiA3 = Arrays.asList("Geamuri electrice", "Aer conditionat");
        List<String> DotariIntAudiA3 = Arrays.asList("Geamuri electrice", "Aer conditionat");
        Audi A3 = new Audi("Audi", "A3", "manuala", 14000, DotariExtAudiA3, DotariIntAudiA3);
        A3.InfoAudi();

        List<String> DotariExtAudiQ7 = Arrays.asList("Geamuri electrice", "Aer conditionat");
        List<String> DotariIntAudiQ7 = Arrays.asList("Geamuri electrice", "Aer conditionat");
        Audi Q7 = new Audi("Audi", "Q7", "manuala", 20000, DotariExtAudiQ7, DotariIntAudiQ7);
        Q7.InfoAudi();

        System.out.println("==obiectBMW");
        BMW X5 = new BMW("BMW", "X5", "Automata", 70500, false);
        X5.InfoBMW();
        X5.AfisareMasini("masina");
        X5.AfisareMasini(123);
        X5.AfisareMasini();



    }







}
