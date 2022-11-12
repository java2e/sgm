import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test8 {

    /*
    Collections => Java bir kütüphanedir.

    Listeler ile ilgili işlemler yapmanız işe yarayacak
    diziler
    [] => boyut aynı değerler ekliyorsunuz
    ardısık 0 1 2 3 index listeler
    rastgele memory göre listelme
    List<DataType> interaface => ArrayList
    Map<Key,Value> interface => HashMap
     */

    public static void main(String[] args) {


        ArrayList<String> liste = new ArrayList<>();

        liste.add("Java");
        liste.get(0);
        //liste.clear();
        liste.isEmpty(); // liste bos olup olmadıgını kontrol eder
        liste.addAll(liste);
        //liste.remove(0);
        liste.size(); // içerisinde kac tane value var onu verir

        List<String> liste2 = new ArrayList<>(); // polimorfizm

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<10;i++) {

            System.out.println("Kelime giriniz ");

            liste2.add(scanner.nextLine());

        }

        for(String kelime:liste2)
            System.out.println(kelime);



    }
}
