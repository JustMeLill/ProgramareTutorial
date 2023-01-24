package Tema;

import org.testng.annotations.Test;

import java.util.Date;

@Test
public class Tema2 {


    public String UC1;

    @Test(priority = 1)
    public void UC1(){
        UC1 = "Hello World!";

         System.out.println("Primul UC consta in printarea expresiei: " + UC1);
         System.out.println(AdaugareText((String)));
    }


    public Integer UC2;

    @Test(priority = 2)
    public void UC2(){
        UC2 = 34;

        System.out.println("Al doilea UC consta in printarea unei varste: " + UC2);
        System.out.println(AdaugareText((String)));

    }

    public String UC3;

    @Test(priority = 3)

    public void UC3(){
        UC3 = "Data de astazi: ";

        Date d1 = new Date();

        System.out.println(UC3 + d1);
        System.out.println(AdaugareText((String)));
    }

    public String UC4;

    @Test(priority = 4)

    public void UC4(){

        UC4 = "Rezultatul pentru [2+(3*4)-3]/3 este egal cu: ";

        int result = (2+(3*4)-3)/3;
        System.out.println("Rezultatul pentru [2+(3*4)-3]/3 este egal cu: " + (result));
        System.out.println(AdaugareText((String)));
    }

    @Test(priority = 5)

    public void UC5(){

        int result = (int) (15.123 + 12.321 + 3.567);
        System.out.println("Rezultatul pentru 15.123 + 12.321 + 3.567 este egal cu: " + (result));
        System.out.println(AdaugareText((String)));

    }

    @Test(priority = 6)

    public void UC5B(){

        Double Nr1 = 15.123;
        Double Nr2 = 12.321;
        Double Nr3 = 3.567;

        double sum = Nr1 + Nr2 + Nr3;
        System.out.println("Suma cifrelor 15.123, 12.321, 3.567 este: " + (sum));
        System.out.println(AdaugareText((String)));

    }
    @Test(priority = 7)

    public void UC6(){

        Integer IntNr1 = 12;
        Integer IntNr2 = 8;

        int product = IntNr1 * IntNr2;
        System.out.println("Produsul cifrelor 12 si 8 este: " + (product));
        System.out.println(AdaugareText((String)));

    }
    @Test(priority = 8)

    public void UC7(){

       Double ConNr1 = 31.011;
       Integer ConNr2 = 96;

       String result = ConNr1 + " " + ConNr2;
       System.out.println(result);
       System.out.println(AdaugareText((String)));

    }

    public String String;
    public Character Character;

    @Test(priority = 9)

    public void UC8(){

        String = "Salut";
        Character = 'M';

        System.out.println("SalutM");
        System.out.println(AdaugareText((String)));
    }
    @Test(priority = 10)

    public void UC8B(){

        String FormulaDeSalutInRomana = "Salut";
        FormulaDeSalutInRomana = FormulaDeSalutInRomana + "M";

        System.out.println(FormulaDeSalutInRomana);
        System.out.println(AdaugareText((String)));

    }

    public String String2;
    public Character Character2;
    @Test(priority = 11)

    public void UC9(){

        String2 = "Hello";
        Character2 = 'H';

        System.out.println("HHello");
        System.out.println(AdaugareText((String)));

    }
    @Test(priority = 12)

    public void UC9B(){
        String FormulaDeSalutEngleza = "Hello";
        FormulaDeSalutEngleza = "H" + FormulaDeSalutEngleza;

        System.out.println(FormulaDeSalutEngleza);
        System.out.println(AdaugareText((String)));

    }

    @Test(priority = 13)

    public void UC10(){

        String text = "Ana are mere,pere,prune";
        StringBuilder sb = new StringBuilder(text);

        for (int i = text.length() - 1; i >= 0; i--) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb.insert(i + 1, 'Z');
            }
        }

        String result = sb.toString();

        System.out.println(result);
        System.out.println(AdaugareText((String)));

    }

    private String AdaugareText(String string) {
        return String = "Poti pleca acasa dupa ce iti verific tema";
    }

    //@Test
    //public void AdaugareText(java.lang.String string){

        //String = "Poti pleca acasa dupa ce iti verific tema";

        //System.out.println(String);
   // }


}
