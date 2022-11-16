import javax.naming.Name;
import java.util.jar.Attributes;

public class Drill {
    private int watt;     //Attribute
    private String name;
    private int age;
    private double price;
    private boolean broken;

    public Drill() {

        watt = (int) (Math.random() * 1201) + 800;      //Zufaellige Watt Zahl
        age = (int) (Math.random() * 11);               //Zufaelliges Alter
        price = (double) (Math.random() * 501 + 50);
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

    public boolean getBroken() {
        return broken;
    }

    public double getPrice() {
        return price;
    }

    public void becomeBroken() {
        broken = true;
    }

    public void repair() {
        if (broken == true) {
            broken = false;
            price = price / 2;
        }
    }

    public void aging() {
        age = age + 1;
        if (age > 9) {
            becomeBroken();
        }
    }

    public void reactOnHighDemand() {
        price = price + (price * 0.25);
    }

    //aufgabe3 und so
    public void setBroken(boolean isBroken) {
        this.broken = broken;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInexpensive() {
        if (watt > 500 && price < 80){
            return true;
        }else{
            return false;
        }
    }

    //Aufgabe 5 here we go.
    public boolean increasePriceByPercentage(double percentage){
        if (percentage > 0.0){
            setPrice(getPrice() *(1 + percentage));
            if (getPrice() > 100){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public boolean repair2(){
        if (broken == true){
            broken = false;
            return true;
        }else{
            return true;
        }

        public String getInfo(){
            String infoes = "Name:"+name+"\nAlter:"+age+"\nWatt:"+watt+"\nPreis:"+price;
        }
    }
}