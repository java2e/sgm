

public class Test6 {

    /*
    Inheritance Kalıtım

    extend keyword

    class1 class2


    sub class  <- super class


    Kapsülleme , encapsulation

    private protected ve public

    private tanımlı variable

    interface
    abstract



    polimorfizm => Çok bicimlilik

    Interface Arayüzler

    interface new

    Abstract Class Soyut Sınıflar

    içerisinde bos method abstarct methodlar barındırı
    bundan direk olarak nesne üretimi yapamazsını new
    abstract

    1. Nesne üretimi yok
    2. private method tanımı
    3. constructor method mevcut değildir.

    1-exceptions
    2-JDBC veritabanı
    3-I/O
    4-Collections

    -Reflection
    -Generics

    1-Geniş Örnek Proje

    Exception

    Hatalar yakalama mekanizması

    Exception

    Runtime
    Error

    try catch


    try {


    }
    catch(exception tipi) {

    }
    finally{

    }



     */
    public static void main(String[] args) {

        //Araba araba = new Araba(); // bir tane araba nesnesi üretiyor

        //Kamyon kamyon = new Kamyon(); // bir tane araba nesnesi arakasında kamyon nesnesi

       // kamyon.vitesAt(3);

        Araba araba = new Araba();
        araba.vitesAt(5);
        Araba araba1 = new Kamyon();
        araba1.vitesAt(5);
        Araba araba2 = new Taksi();
        araba2.vitesAt(5);

        // polimorfizm cok bicimlilik
    }
}
