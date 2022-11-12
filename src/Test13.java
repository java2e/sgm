import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test13 {

    public static void main(String[] args) {

        try {

            File file = new File("C:\\Users\\Mehmet Demircioglu\\Desktop\\sigrortabilgi\\test.txt");

            InputStream inputStream = new FileInputStream(file);

            int content;

            while ((content = inputStream.read()) != -1) {
                System.out.print((char)content);
            }


        }
        catch (IOException ex) {
            System.out.println(ex);
        }



    }
}
