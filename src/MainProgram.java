public class MainProgram {
        public static void main(String[] args){
            Drill d1 = new Drill();            //drei Bohrmaschinen Objekte
            Drill d2 = new Drill();
            Drill d3 = new Drill();

            System.out.println("D1: " +"Watt "+d1.getWatt()+" Age "+d1.getAge());        //das printen der drei Objekte
            System.out.println("D2: " +"Watt "+d2.getWatt()+" Age "+d1.getAge());
            System.out.println("D3: " +"Watt "+d3.getWatt()+" Age "+d1.getAge());
        }

}
