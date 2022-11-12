package com.sigorta.model;

import java.util.List;

public class Acenta extends BaseModel {
    //adres,vkn,telefon,email,Sigorta Şirketleri
    private String adres;
    private String vkn;
    private String telefon;
    private String email;
    private List<Sigorta> sigortaListesi;

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getVkn() {
        return vkn;
    }

    public void setVkn(String vkn) {
        this.vkn = vkn;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Sigorta> getSigortaListesi() {
        return sigortaListesi;
    }

    public void setSigortaListesi(List<Sigorta> sigortaListesi) {
        this.sigortaListesi = sigortaListesi;
    }

    @Override
    public String toString() {
        return "Acenta{" +
                "adres='" + adres + '\'' +
                ", vkn='" + vkn + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", sigortaListesi=" + sigortaListesi +
                '}';
    }
}
