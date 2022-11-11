import paket1.Personel;

public class Test7 {

    public static void main(String[] args) {

        try{

            Personel personel = null;
            if(personel==null) throw new MyException("Null hatası!");
            personel.hesapla(5); // nullpointer


        }
        catch (Exception ex) {


            System.out.println(ex.getMessage());

        }

        System.out.println("hesapla methodu cagrıldı");


    }
}
