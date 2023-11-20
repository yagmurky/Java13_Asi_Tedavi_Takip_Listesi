package com.yagmur;

import com.yagmur.entity.Doktor;
import com.yagmur.entity.Normal_Insan;
import com.yagmur.entity.Saglik;
import com.yagmur.entity.Super_Insan;

public class Runner {
    public static void main(String[] args) {

        Saglik saglik=new Saglik();

        Normal_Insan hasta1=new Normal_Insan("Yagmur",1);
        hasta1.setHastalikRiski(false);

        Normal_Insan hasta2= new Normal_Insan("Ekin",2,true);
        Super_Insan superInsan1= new Super_Insan("Damla",3);
        Doktor doktor=new Doktor("Hatice",4,true,true);
        Doktor doktor2=new Doktor("Atilla",5,false,true);

        saglik.asilamaYap(hasta1);
        saglik.asilamaYap(hasta2);
        saglik.asilamaYap(doktor);
        saglik.asilamaYap(doktor2);
        saglik.asilamaYap(superInsan1);
        saglik.asilananlarRaporu();




    }
}
