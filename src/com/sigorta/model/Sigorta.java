package com.sigorta.model;

import java.util.List;

public class Sigorta extends BaseModel{

    //,adres,vkn,telefon,email,Sigorta Tipleri

    private String adres;
    private String vkn;
    private String telefon;
    private String email;
    private List<String> sigortaTipleri;

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

    public List<String> getSigortaTipleri() {
        return sigortaTipleri;
    }

    public void setSigortaTipleri(List<String> sigortaTipleri) {
        this.sigortaTipleri = sigortaTipleri;
    }
}
