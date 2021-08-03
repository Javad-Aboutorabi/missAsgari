import java.util.ArrayList;
import java.util.Random;

public class Car {

    public int id;
    public String name;
    public String color;
    public String country;
    public String city;

    public Car(int id, String name, String color, String company) {
        this.id = id;
        this.name=name;
        this.color=color;
        this.country =company;
        this.city=city();
    }

    public String city(){
        ArrayList<String> cites =new ArrayList<>();
        cites.add("Tehran");
        cites.add("Esfahan");
        cites.add("Gorgan");
        cites.add("Qom");
        cites.add("Mashhad");
        cites.add("Tabriz");
        cites.add("Kerman");
        cites.add("Bandar Abbas");
        cites.add("Rash");
        Random random=new Random();
        return cites.get(random.nextInt(9));
    }
}
