package Multimi;

import org.testng.annotations.Test;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Craciun {

    @Test
    public void MetodaTest(){
        //MultimeNumeArray();
        //MultimeNumeLista();
        //MultimeValori();
        TariOrase();


    }

    //Array

    public void MultimeNumeArray(){
        String[] NumeCursanti = new String[7];
        NumeCursanti[0] = "Daniela";
        NumeCursanti[1] = "Liliana";
        NumeCursanti[2] = "Alex";
        NumeCursanti[3] = "Raul";
        NumeCursanti[4] = "Delia";
        NumeCursanti[5] = "Corina";
        NumeCursanti[6] = "Anca";
     for (Integer index = 0; index < NumeCursanti.length; index++){
         System.out.println(NumeCursanti[index]);
     }

    }

    //Lista

    public void MultimeNumeLista(){
        List<String> NumeCursanti = new ArrayList<>();
        NumeCursanti.add("Daniela");
        NumeCursanti.add("Liliana");
        NumeCursanti.add("Alex");
        NumeCursanti.add("Raul");
        NumeCursanti.add("Delia");
        for (Integer index = 0; index < NumeCursanti.size(); index++){
            System.out.println(NumeCursanti.get(index));
        }
    }

    //Hashmap - defineste o lista cu mai multe categorii de itemi. Preferabil se face cu for each.
    //key = value

    public void MultimeValori(){

        //fotbal, cana, acadea

        HashMap<String,String> Elemente = new HashMap<>();
        Elemente.put("Sport", "fotbal");
        Elemente.put("Obiecte", "cana");
        Elemente.put("Dulciuri", "acadea");

        for (String Key: Elemente.keySet()){
            System.out.println(Key + " " + Elemente.get(Key));
        }


    }

    //Printam o lista de tari cu orasele lor (keys cu valori multiple)

    public void TariOrase() {


        List<String> OraseRomania = new ArrayList<>();
        OraseRomania.add("Sibiu");
        OraseRomania.add("Timisoara");
        OraseRomania.add("Valcea");
        List<String> OraseItalia = new ArrayList<>();
        OraseItalia.add("Roma");
        OraseItalia.add("Milano");
        OraseItalia.add("Venetia");
        List<String> OraseSpania = new ArrayList<>();
        OraseSpania.add("Barcelona");
        OraseSpania.add("Madrid");
        OraseSpania.add("Valencia");

        HashMap<String, List<String>> Tari = new HashMap<>();
        Tari.put("Romania", OraseRomania);
        Tari.put("Italia", OraseItalia);
        Tari.put("Spania", OraseSpania);

        for (String Key : Tari.keySet()) {
            System.out.println(Key + " " + Tari.get(Key));

        }

    }



}
