public class Kamyon extends Araba {

    public String lastikSayisi;

    public Kamyon() {
        System.out.println("Kamyon nesnesi üretildi!");
    }

    @Override
    public void vitesAt(int vites) {
        System.out.println("Kamyon vites attı!");
    }
}

/*

Kamyon bir arabadır!
Taksi bir arabadır!
Araba bir taksi olabilir mi
Araba bir kamyon olabilir mi
Kamyon bir taksidirxxxx
 */
