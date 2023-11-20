package com.yagmur.entity;

public class Doktor extends Insan{
    private boolean asisizMi;
    private boolean tasiyiciMi;

    public Doktor() {
        System.out.println("Doktor constructorı.");
    }

    public Doktor(String ad, int id) {
        super(ad, id);
    }

    public boolean isAsisizMi() {
        return asisizMi;
    }

    public void setAsisizMi(boolean asisizMi) {
        this.asisizMi = asisizMi;
    }

    public Doktor(String ad, int id, boolean asisizMi, boolean tasiyiciMi) {
        super(ad, id);
        this.asisizMi = asisizMi;
        this.tasiyiciMi = tasiyiciMi;
    }

    public Doktor(boolean tasiyiciMi) {
        this.tasiyiciMi = tasiyiciMi;
    }

    public boolean isTasiyiciMi() {
        return tasiyiciMi;
    }

    public void setTasiyiciMi(boolean tasiyiciMi) {
        this.tasiyiciMi = tasiyiciMi;
    }
}
