package chapter12;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args){
        setDemo();
        mapDemo();
    }

    public static void setDemo(){
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        //fruit.forEach(x -> System.out.println(x));
        fruit.forEach(System.out::println);

        /*for(String item : collection){
            System.out.println(item);
        }
        */
            
        }

    public static void mapDemo(){

        Map <String,Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);


        fruitCalories.forEach(
                (k,v)->System.out.println("Fruit: " + k + ", Calories: " + v));
    }
    }




