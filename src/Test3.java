import paket1.Personel;

import java.util.Scanner;

public class Test3 {
    /*
    Class =>  Sınıflar
    OOP => Object Orienting Programming
    Nesneye Yönelik Programlama
    Class =>
    1. constructor zorunlu olarak olusturulması // kendisi olusturabilir.
    2. variable int sayi
    3. method

    class ismi mutlaka buyuk baslamalı
    personel => Personel
    ?123_& kullanıyoruz
    class keyword
    public private protected

    Access Modifier Erişim Anahtarları
    public => proje içerisinde butun paketler içerisinde erişim sağlayabilirsin.
    protected => sadece kendi paket içerisindeki sınıflar içerisinde erişim sağlar
    private => sadece kendi sınıfının içerisinde erişim sağlar.

    paket => package

    Bir sınıfı kullanabilmek new anahtarı sozcugu

    Bir sınıf üzerinden instance,obje veya nesne üretimi sağlar
    Personel instanceAdi = new Personel();

    Manager
        name
        surname
        id
        position

        method1:  isim ve soyisim seklinde string ceviren bir method yazınız
        method2:  bir string position alan ve bu parametreyi position aktaran method yazınız.

        constructor int tipinde parametre ve aldıgı parametreyi idye aktarsın.




        BankaHesabi Account
            id  int
            bankaAdi XBANK string
            hesapAdi Vadesiz string
            adi string
            soyadi string
            hesapTipi TL EURO DOLAR string
            bakiye float


            tl euro
            tl dolar
            dolar tl
            euro tl
            ceviren method(param1,param2,param3)  TL,EURO,bakiye
               if(tl

            dısardana alacagı bakıyeyı yukardkı seceneklere gore cevıren bır tane method

            hesapBilgisi bir method bir method adi soyadı hesapadi heasp tipi ve bakiye
            bir arada ceviren string tipinde bir method yazınız.
            return this.name
            dısardan float tipinde bir değer alıp bakiyeyi guncelleyen bir method yazınız
            bakiye =bakiye + param1;
            10 >15 => 25



     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Personel personel = new Personel("Java Developer");

        personel.sayi = 10;

        int sonuc = personel.hesapla(15);

        System.out.println(sonuc);
    }

}



