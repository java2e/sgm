package com.sigorta.model;

import java.util.List;

public class Musteri extends BaseModel{
    //    Musteri -> id,adi,soyadi,telefon,adres, Sigortalar
    private String soyadi;
    private String telefon;
    private String adres;
    private List<MusteriSigorta> sigortaListesi;

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public List<MusteriSigorta> getSigortaListesi() {
        return sigortaListesi;
    }

    public void setSigortaListesi(List<MusteriSigorta> sigortaListesi) {
        this.sigortaListesi = sigortaListesi;
    }
}
