public class Test2 {

    /*

    Methodlar

    public veritipidonus methodadi(parametreler)
    {

    method kod blogu


    }

    // static keyword uygulama ilk calıstırdıgınızda ilk uygulamanın içerisindeki static
    tanımlanan variable veya methodlar bellege yazılır
    nesneye bagımsız sekılde gıder.

    return => method işlem yaptıktan sonra cıkan sonucu methdo dısarıya vermek ıcın kullanılır
    return donustıp methodu tıpı
    return int method int

     */

    public static int topla(int sayi1,int sayi2) {

        int sonuc = sayi1 +sayi2;
        return sonuc;

    }

    public static void main(String[] args) {

        int sonuc = topla(10,20);
        System.out.println(sonuc);
    }

}
