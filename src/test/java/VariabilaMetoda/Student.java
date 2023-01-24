package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //Asta este un comentariu
    //Clasa = un sablon care contine variabile si metode
    //Intr-un fisier JAVA putem avea mai multe clase diferentiate prin numele lor (nu este un lucru bun
    //sa ai mai multe clase intr-un fisier)
    //O clasa trebuie sa aiba un nume
    //O clasa se recunoaste dupa cuvantul class
    //Tot timpul o clasa trebuie sa fie publica
    //Variabila = atributul unei clase
    //Variabilele sunt de doua feluri - global si local
    //Variabila globala = este vizibila peste tot in program
    //Variabila locala = este vizibila doar in locul unde este declarata


    public String Nume;
    public String Prenume;
    public String Adresa;
    public Integer Varsta;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;
    public Boolean EsteAngajat;


    //Metoda = actiune la nivel de clasa.
    //Metodele sunt de doua feluri - void si return

    @Test
    public void PrezentareStudent()
    {
        Nume = "Dutescu";
        Prenume = "Lili";
        Adresa = "Negoveanu, nr.12";
        Varsta = 34;
        Inaltime = 1.63;
        Greutate = 53.5f;
        Sex = 'F';
        EsteAngajat = true;

        //comanda print afiseaza si ramane pe acelasi rand
        //comanda println afiseaza si sare la randul urmator
        //Daca vrem sa legam doua siruri de caractere folosim conceptul de concatenare (+)

        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Prenumele studentului este: " + Prenume);
        System.out.println("Adresa studentului este: " + Adresa);
        System.out.println("Varsta studentului este: " + Varsta);
        System.out.println("Inaltimea studentului este: " + Inaltime);
        System.out.println("Greutatea studentului este: " + Greutate);
        System.out.println("Sexul studentului este: " + Sex);
        System.out.println("Studentul este angajat? " + EsteAngajat);

    }
@Test
    public void AdaugareNume ()
    {
      //Declaram o variabila locala

      String Prenume2 = "Nicoleta";
      //Nume = "Dutescu";
      //Prenume = "Lili";

      System.out.println("Numele complet este: " + Nume +" "+ Prenume + " " + Prenume2);
      System.out.println("Bonus de Craciun este: " + String.format("%.3f",getBonus()));

    }

    //Facem o metoda cu return

    public Double getBonus ()
    {
       Double Bonus = 1.000;
       return Bonus;

    }




   }