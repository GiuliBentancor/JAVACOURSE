package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String args[]) {
        //createNewFile();
        //numbersExceptionHandling();
        createNewFileRethrow();
    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        Scanner fileReader= null;
        try {
            fileReader = new Scanner(file)
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException{
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");
        Scanner fileReader= null;
        try {
            fileReader = new Scanner(file);
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
        }
    }
}