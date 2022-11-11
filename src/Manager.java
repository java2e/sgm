public class Manager {

    public int id;

    public String name;

    public String surname;

    public String position;

    public Manager(int param1) {
        this.id = param1;
    }

    public String nameSurname() {
        return this.name+" "+this.surname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
