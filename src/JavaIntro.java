//The first java lesson

import java.util.Scanner;

public class JavaIntro {
    public static void main(String[] args) {
        //Integrated output class
        System.out.println("Welcome to Java Profession Lesson.");//ln -> next line

        //print
        System.out.print("Welcome to Java Profession Lesson with print ");//выведи мне сообщение и там же останься

        //print
        System.out.print("Welcome to Java");
        System.out.print("This is the next line...");

        //println vs. print
        System.out.println(); // любой вывод требует чего-то на выход - передает знак следующей строчки
        System.out.print(""); // error
        typePersonalData();
        typeSymbolsAndNumbers();
        countBodyMassIndex();
    }

    public static void typePersonalData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please,enter your name:");
        String name = scanner.nextLine();
        System.out.print("Please,enter your surname:");
        String surname = scanner.nextLine();
        System.out.print("Please,enter your age:");
        int age = scanner.nextInt();
        System.out.print("Please,enter your height:");
        int height = scanner.nextInt();
        System.out.print("Please,enter your weight:");
        double weight = scanner.nextDouble();

        System.out.println("Name: " + name +
                "Surname:" + surname +
                "Age" + age +
                "Height" + height +
                "Weight" + weight);

    }

    public static void typeSymbolsAndNumbers() {

        char myChar = 'C';
        System.out.print("myChar:" + myChar);
        System.out.print(" - ");
        System.out.print("myChar:" + (int) myChar);

        char myCharLow = 'a';
        System.out.print("myCharLow:" + myCharLow);
        System.out.print(" - ");
        System.out.print("myCharLow:" + (int) myCharLow);

    }

    public static void countBodyMassIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please,enter your height: ");
        float height = scanner.nextFloat();
        System.out.print("Please,enter your weight:");
        double weight = scanner.nextDouble();//При использвании переменной double код не работает.
        double iIBM = weight / (double)(height * height);
        System.out.print("iIBM = " + iIBM);
    }


}









