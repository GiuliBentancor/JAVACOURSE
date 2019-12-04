package chapter6;

public class HomaAreaCalculator {
    public static void main(String args[]) {

        //create instance
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2= new Rectangle(30, 75);
        double areaOfRoom2= room2.calculateArea();


        double totalArea= areaOfRoom1 + areaOfRoom2;
        System.out.println("The total area is " + totalArea);
    }

}
