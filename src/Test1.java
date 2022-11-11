public class Test1 {
    /*

    8 tane primitive data types
    numeric short int long  = float double
    mantıksal boolean 0 1 true false
    karakter  char karakterleri tutan asccio tablos 1- 255
    byte => 0011 4

    String primitive => Object
     */
    /*
    değişken variable
    dataType değişkenIsmi
    int sayi=10;

    Mantıksal İşlemleri
    if
    else if
     else

     if(şart) => true false  mate, şart1 şart2 şart3 ... mantıksal oper && || !=
     {
     şartı sağlaması durumunda yapılacak kod blogu
     }

     if(şart1)
     {

     }
     else if(sart2)
     {

     }
     ....
     ....
     else{
        butun sartları saglamazsa ....
     }

     donguler

     for() = for(baslangıc;sart;artırım veya azaltım) {    }
     while(şart) { .... ...bozacak donguden dısaraıya ıfade yazman}
     do while (şart)

     diziler Array

     birden fazla değerli tutan variable

    1. aynı tipte olmalı
    2. baslamdan boyutu belirtmek


    datatipi degiskenismi [] = new datatipi[boyut]

    int sayilar [] = new int[5];
    sayilar[0] = 10;
    sayilar[1] = 15;
    ...
    ...
    sayilar[4] = 20;

    sayilar.length= dizinin boyutu verecektir.

    1. Örnek

    Rastgele 5 tane sayı tutunuz, tutulan sayı asal olmak zorundadır.

    sayılar 35 ila 175 arasında olsun

    1.dizi tanımlama yapınız
    2 for dongusu yada while ile 5 tane sayı tutacak dongu yazınız
    3 dongu içerisinde Math.random kullanarak bir sayı tutunuz
    4 bu sayının asal olup olmadıgını kontrol edınız
    5 eğer asal sayı ıse dizi içerisine ekleyiniz.

ASAL SAYI => 1 ve kendisine bölünebilen sayı
     */

    public static void main(String[] args) {

        int dizi [] = new int[5];

        int i=0;

        while (i<5) {

            int sayi = (35 +((int) (Math.random()*140))); // 0 ila 1 arasında double 0.45  0.789898979798
            // asal sayı sorgulama
            boolean isAsal = true;
            for(int j=2;j<sayi;j++) {
                if(sayi % j == 0){
                    isAsal=false;
                }
            }

            if(isAsal) {
                System.out.println(sayi);
               dizi[i] = sayi;
               i++;
            }


        }




    }



}
