package Tema;

import org.openqa.selenium.devtools.v106.storage.model.InterestGroupAccessed;
import org.testng.annotations.Test;

import javax.swing.plaf.metal.MetalIconFactory;
import java.lang.module.FindException;
import java.net.BindException;
import java.sql.SQLOutput;
import java.util.Scanner;

@Test
public class Tema3 {

    public void NumereFor (){

        for (Integer index = 0; index < 10; index++){
            System.out.println(index);
        }
    }

    public void NumereDivizibile (){

        for (Integer index = 0; index < 7; index++){
            if (index % 3 == 0){
                System.out.println(index);
            }
        }
    }





    public void NumereDivizibile5 (){

        for (Integer index = 0; index < 11; index++){
            if (index % 5 == 0){
                System.out.println(index);
            }
        }
    }

    public void SirCuDa () {

        for (int i = 0; i < 5; i++) {
            System.out.print("DA ");
        }

    }

    public void SirCuDA2 () {

        int i = 0;
        while (i < 5) {
            System.out.print("DA ");
            i++;
        }
    }


    public void NrPareSiPozitive(){
        for (Integer index = 0; index < 7; index++){
            if (index % 2 == 0 && index >= 0){
                System.out.println(index);
            }
        }

    }

    public void Sum () {

        Integer Nr1 = 1;
        Integer Nr2 = 2;
        Integer Nr3 = 3;
        Integer Nr4 = 4;
        Integer Nr5 = 5;
        Integer Nr6 = 6;
        Integer Nr7 = 7;
        Integer Nr8 = 8;
        Integer Nr9 = 9;
        Integer Nr10 = 10;

        Integer sum = Nr1 + Nr2 + Nr3 + Nr4 + Nr5 + Nr6 + Nr7 + Nr8 + Nr9 + Nr10;
        System.out.println((sum));

    }

    public void Produs () {

        Integer Nr1 = 1;
        Integer Nr2 = 2;
        Integer Nr3 = 3;
        Integer Nr4 = 4;
        Integer Nr5 = 5;

        Integer product = Nr1 * Nr2 * Nr3 * Nr4 * Nr5;
        System.out.println(product);
    }

}

