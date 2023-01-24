package ObiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TelefonTest {

    @Test
    public void MetodaTest(){

        //Facem primul obiect de tipul Telefon

        List<String> CaracteristiciSamsung = Arrays.asList("ecran:2px", "ram:4GB", "procesor:exinos");
        Telefon Samsung = new Telefon("Samsung", "Galaxi S22", 2021, "Android", CaracteristiciSamsung);
        Samsung.VechimeTelefon();
        Samsung.DiscountTelefon(10.0);

        //Facem al doilea obiect de tipul Telefon

        List<String> CaracteristiciIphone = Arrays.asList("ecran:4px", "ram:8GB", "procesor:A16", "spatiu stocare:128GB");
        Telefon Iphone = new Telefon("Iphone", "Iphone7", 2016, "IOs", CaracteristiciIphone);
        Iphone.VechimeTelefon();

        //Inca o rulare cu o noua variabila

        Iphone.PretTelefon();

        //Inca un obiect cu al 2-lea constructor


        List<String> CaracteristiciHuawei = Arrays.asList("ecran:2px", "ram:17GB", "procesor:A121", "spatiu stocare:122GB");
        Telefon Huawei = new Telefon("Huawei", "Huawei", 2010, "Android", CaracteristiciIphone, 2055.5);
        Huawei.VechimeTelefon();

        //Inca o rulare cu extra public void unde calculam o reducere din pretul telefonului

        Huawei.DiscountTelefon(10.0);


    }

}
