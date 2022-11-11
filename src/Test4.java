public class Test4 {

    public static void main(String[] args) {

        Manager manager = new Manager(1);

        manager.name ="Java";
        manager.surname="Developer";
        manager.position ="Developer";

        String nameSurname = manager.nameSurname(); // string name surname

        System.out.println(nameSurname);

        manager.setPosition("Analyst");

        System.out.println(manager.position);


    }
}
