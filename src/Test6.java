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



    polimorfizm =>

    Interface Arayüzler

    interface

    1. Nesne üretimi yok
    2. private method tanımı
    3. constructor method mevcut değildir.


     */
    public static void main(String[] args) {

        //Araba araba = new Araba(); // bir tane araba nesnesi üretiyor

        Kamyon kamyon = new Kamyon(); // bir tane araba nesnesi arakasında kamyon nesnesi

        kamyon.vitesAt(3);
    }
}
