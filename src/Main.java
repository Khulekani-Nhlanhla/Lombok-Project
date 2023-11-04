public class Main {
    public static void main(String[] args) {
        CarWithLombok car1 = new CarWithLombok("GLE","Mercedes",2020,245_980,"white",5);
        CarWithLombok car2 = new CarWithLombok("GLC","Mercedes",2023,250_000,"green",3);
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car1.getColor());
        car1.setColor("black");
        System.out.println("Are these objects equal? " + car1.equals(car2));
        System.out.println("The Hashcode of the first object is: "+ car1.hashCode());
        System.out.println("The Hashcode of the second object is: "+ car2.hashCode());
    }
}
