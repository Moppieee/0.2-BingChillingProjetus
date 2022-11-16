public class MainProgram {
        public static void main(String[] args){
            Drill d1 = new Drill();            //drei Bohrmaschinen Objekte
            Drill d2 = new Drill();
            Drill d3 = new Drill();
            d1.aging();
            System.out.println("D1: " +"Watt "+d1.getWatt()+" Age "+d1.getAge()+ " Price: "+d1.getPrice()+" kapiut? "+d1.getBroken());        //das printen der drei Objekte
            System.out.println("D2: " +"Watt "+d2.getWatt()+" Age "+d2.getAge()+" Price: "+d2.getPrice()+" kapiut? "+d2.getBroken());


            System.out.println("D3: " +"Watt "+d3.getWatt()+" Age "+d3.getAge()+" Price: "+d3.getPrice()+" kapiut? "+d3.getBroken());
        }
//done
}
