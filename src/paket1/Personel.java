package paket1;

public class Personel {


    //erişimAnahtarı datatiği değişken = initiliaze değer;

    public int sayi;  // gloabl tanım local variable tanım

    public int hesapla(int sayi) {
        int sonuc = (int)Math.pow(sayi,2);
        return sonuc;
    }

    public Personel(String param1) {
        System.out.println("Gelen Parametre :"+param1);
    }

}
