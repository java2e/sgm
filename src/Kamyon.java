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
