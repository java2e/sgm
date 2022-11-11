public class Test5 {
    public static void main(String[] args) {

        Account account = new Account();
        account.adi ="Java";
        account.soyadi="Developer";
        account.hesapAdi="Vadesiz";
        account.hesapTipi="TL";
        account.bankaAdi="JavaBank";
        account.id = 1;

        account.setBakiye(20); //encapsilation kapsulleme

        float sonuc = account.cevirici("TL","EURO",150);

        System.out.println("Sonuc TL->EURO :"+sonuc);

        account.guncelle(150);

        System.out.println("Son Bakiye :"+account.getBakiye());

        String hesapBilgisi = account.getHesapBilgisi();

        System.out.println(hesapBilgisi);

    }
}
