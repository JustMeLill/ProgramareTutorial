package Tema;

import org.testng.annotations.Test;

public class Tema1 {

    //Definesc cateva atribute pentru un calculator (procesor, ram, memorie, etc), cu o metoda cu valori care sa se afiseze.

    public String TipDevice;
    public String Brand;
    public String TipEcran;
    public String Rezolutie;
    public Double DimensiuneEcran;
    public Float FrecventaProcesor;
    public Boolean EcranTouch;
    public String Culoare;
    public Character InitialaCuloare;

    @Test(priority = 1)
    public void PrezentareDevice()
    {
       TipDevice = "laptop";
       Brand = "DELL";
       TipEcran = "LED";
       Rezolutie = "1920 x 1080";
       DimensiuneEcran = 15.6;
       FrecventaProcesor = 1.9f;
       EcranTouch = false;
       Culoare = "Negru";
       InitialaCuloare = 'N';

       System.out.println("Tipul device-ului este: " + TipDevice);
       System.out.println("Brand-ul device-ului este: " + Brand);
       System.out.println("Rezolutia device-ului este: " + Rezolutie);
       System.out.println("Device-ul are un ecran de " + DimensiuneEcran + " inch");
       System.out.println("Frecventa procesorului este de: " + FrecventaProcesor + " GHz");
       System.out.println("Ecranul device-ului este de tip Touch? " + EcranTouch);
       System.out.println("Device-ul este: " + Culoare);
       System.out.println("Initiala utilizata pentru a specifica culoarea device-ului este " + InitialaCuloare);

    }

    @Test(priority = 2)
    public void Pret ()
    {
        String Pret = "6.995 RON";

        System.out.println("Pretul device-ului este: " + Pret);

    }


}

//Intrebare: cum definim metode si variabile cu liste predefinite de itemi?

//poti sa setezi prioritatea testului cu optiunea priority = 1,2,3,etc
