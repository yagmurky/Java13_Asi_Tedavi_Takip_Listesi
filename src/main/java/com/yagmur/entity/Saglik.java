package com.yagmur.entity;

public class Saglik extends Insan {
    private  Insan[] asilananlar;
    private int asilananlarSayisi;

    public Saglik() {
        this.asilananlar = new Insan[10];
        this.asilananlarSayisi=0;
    }
    private Insan[] expandArray(Insan[] oldArray) {
        int newLength = oldArray.length * 2;
        Insan[] newArray = new Insan[newLength];
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        return newArray;
    }

    public void asilamaYap(Insan insan) {
        if (insan instanceof Normal_Insan) {
            Normal_Insan normalInsan = (Normal_Insan) insan;
            if (normalInsan.isHastalikRiski()) {
                System.out.println(normalInsan.getAd() + " isimli hasta aşılandı.");
                asilananlar[asilananlarSayisi++] = normalInsan;
                if (asilananlarSayisi == asilananlar.length) {
                    asilananlar = expandArray(asilananlar);
                }
            } else {
                System.out.println(normalInsan.getAd() + " isimli hasta bulaş riski taşımıyor.");
            }
        } else if (insan instanceof Doktor) {
            Doktor doktor = (Doktor) insan;
            if (doktor.isAsisizMi()) {
                System.out.println(doktor.getAd() + " isimli doktor aşılıdır. Aşılama yapılamaz...");
            }else {
                System.out.println("Doktorun aşı yaptırması gerekmektedir.");
            }
        } else if (insan instanceof Super_Insan) {
            System.out.println(((Super_Insan) insan).getAd() + " isimli süper insan aşılama gerektirmez.");
        } else {
            System.out.println("Bilinmeyen bir insan tipi, aşılama yapılamaz.");
        }
    }

    public void asilananlarRaporu() {
        System.out.println("Aşılanan İnsanlar:");
        for (int i = 0; i < asilananlarSayisi; i++) {
            System.out.println(asilananlar[i].getAd());
        }
    }



}
