package com.sigorta.model;

import java.util.Date;

public class MusteriSigorta extends BaseModel{
    // Domain Driven Pattern
    private Sigorta sigorta;
    private Acenta acenta;
    private Date baslangicTarihi;
    private Date bitisTarihi;
    private int ucret;

    public Sigorta getSigorta() {
        return sigorta;
    }

    public void setSigorta(Sigorta sigorta) {
        this.sigorta = sigorta;
    }

    public Acenta getAcenta() {
        return acenta;
    }

    public void setAcenta(Acenta acenta) {
        this.acenta = acenta;
    }

    public Date getBaslangicTarihi() {
        return baslangicTarihi;
    }

    public void setBaslangicTarihi(Date baslangicTarihi) {
        this.baslangicTarihi = baslangicTarihi;
    }

    public Date getBitisTarihi() {
        return bitisTarihi;
    }

    public void setBitisTarihi(Date bitisTarihi) {
        this.bitisTarihi = bitisTarihi;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }
}
