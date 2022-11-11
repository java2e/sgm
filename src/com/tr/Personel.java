package com.tr;

public class Personel implements Islem{
    @Override
    public void bilgiYazdir(String bilgi) {
        System.out.println("Personel bilgisi yazıdırıldı");
    }

    @Override
    public String formatBilgi(String bilgi) {
        return bilgi+" personel bilgi formatlandı";
    }
}
