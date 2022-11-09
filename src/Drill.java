public class Drill {
    private int watt;     //Attribute
    private String name;
    private int age;
    private double price;
    private boolean broken;

    public Drill(){

        watt = (int) (Math.random()  *1200) + 800;
        System.out.println(watt);
    }

}
