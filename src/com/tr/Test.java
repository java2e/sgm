package com.tr;

public class Test {

    public static void main(String[] args) {

        Muhasebe muhasebe = new Muhasebe();
        muhasebe.bilgiYazdir("Muhasebe ");
        muhasebe.formatBilgi("Format!");

        Personel personel = new Personel();
        personel.bilgiYazdir("Personel");
        personel.formatBilgi("Personel format!");



    }
}
