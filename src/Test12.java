import java.io.*;

public class Test12 {

    public static void main(String[] args) {
        /*
        Java Input Output
        I/O

        VERİ OKUNMASI
        VERİN YAZILMASI
        txt
        veritabanın
        cihaz üzerinde okuma
        dosya üzerinde
         txt
         veritaba
         cihaz

        */
        try {

        File file = new File("C:\\Users\\Mehmet Demircioglu\\Desktop\\sigrortabilgi\\test.txt");

        OutputStream outputStream = new FileOutputStream(file);

        String text ="Welcome to Java";

        byte [] toText = text.getBytes();

        outputStream.write(toText);

        System.out.println("File is created and writed!");

        }catch (IOException ex) {

        }

    }
}
