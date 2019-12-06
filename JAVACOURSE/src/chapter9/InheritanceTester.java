package chapter9;

public class InheritanceTester {
    public static void main(String[] args){

        Person person = new Person();
        Employee employee = new Employee();

        employee.setAge(25);
        employee.setGender("Femenino");
        employee.setName("Giuliana");
        employee.setTitle("TesterQA");
        employee.setEmployeeId("XYZA");

        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getName());
        System.out.println(employee.getTitle());
        System.out.println(employee.getAge());
        System.out.println(employee.getGender());


        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square");
        square.print();

        Mother mom = new Mother();
        mom.setName("Glenda");

        System.out.println(mom.getName() + " is a " + mom.getGender());
    }
}
