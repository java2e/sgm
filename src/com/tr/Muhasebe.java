package com.tr;

public class Muhasebe implements Islem{

    @Override
    public void bilgiYazdir(String bilgi) {
        System.out.println("Muhasebe bilgisi yazıdırldı");
    }

    @Override
    public String formatBilgi(String bilgi) {
        return bilgi+" format bilgisi yazdırıldı!";
    }
}
