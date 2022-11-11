import java.util.concurrent.RecursiveTask;

public class Account {

    public int id;

    public String bankaAdi;

    public String hesapAdi;

    public String adi;

    public String soyadi;

    public String hesapTipi;

    private float bakiye;


    // getXXX setXXX

    public float getBakiye() {
        return this.bakiye;
    }

    public void setBakiye(float bakiye) {
        this.bakiye = bakiye;
    }

    public Account() {
        this.bakiye = 0.0f;
    }

    public float cevirici(String kaynak,String hedef,float bakiye) {
        float sonuc = 0.0f;
        if(kaynak.equals("TL") && hedef.equals("EURO")) {
            sonuc = bakiye*0.87f;
            return sonuc;
        }
        else if(kaynak.equals("EURO") && hedef.equals("TL")) {
             sonuc = bakiye*1.23f;
            return sonuc;
        }
        else {
             sonuc = bakiye*1.5f;
            return sonuc;
        }

    }


    public String getHesapBilgisi() {
        return this.adi+" "+this.soyadi+" "+this.hesapAdi+" "+" bakiye :"+this.bakiye;
    }

    public void guncelle(float birim) {

        this.bakiye = this.bakiye + birim;

    }


}
