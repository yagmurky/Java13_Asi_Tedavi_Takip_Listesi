package com.yagmur.entity;

public class Normal_Insan extends Insan{

    private boolean hastalikRiski;

    public Normal_Insan() {
    }

    public Normal_Insan(String ad, int id) {
        super(ad, id);
    }

    public Normal_Insan(String ad, int id, boolean hastalikRiski) {
        super(ad, id);
        this.hastalikRiski=hastalikRiski;
    }


    public boolean isHastalikRiski() {
        return hastalikRiski;
    }

    public void setHastalikRiski(boolean hastalikRiski) {
        this.hastalikRiski = hastalikRiski;
    }


}
