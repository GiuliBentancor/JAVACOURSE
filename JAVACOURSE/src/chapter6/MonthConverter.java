package chapter6;

public class MonthConverter {

    /* Tenga en cuenta que puedo llamar a estos dos métodos
    sin crear instancias de la Monthclase porque estos métodos
     son static.
Cuando tengo static methodos dentro de una clase, no hay necesidad
de crear una instancia de esa clase para acceder a ellos.
Puedo acceder a ellos simplemente usando el nombre de la clase y
el operador de puntos.
     */

    public static void main (String args[]){
        System.out.println(Month.getMonth(2)); //No necesitamos instanciar si esta en static
        System.out.println(Month.getMonth("January"));
    }
}
