import javax.naming.Name;
import java.util.jar.Attributes;

public class Drill {
    private int watt;     //Attribute
    private String name;
    private int age;
    private double price;
    private boolean broken;

    public Drill(){

        watt = (int) (Math.random()  *1200) + 800;      //Zufaellige Watt Zahl
        age = (int)  (Math.random() *10);               //Zufaelliges Alter
        price = (double) (Math.random() *500 +50);
        name = "SuperBohrVI";
        //System.out.println("Age: " + age);
        //System.out.println("watt: " + watt);
        //System.out.println("Price: " + price);
    }
    public int getAge() {
        return age;
    }
    public int getWatt() {
        return watt;
    }
    public String getName() {
        return name;
    }
}
