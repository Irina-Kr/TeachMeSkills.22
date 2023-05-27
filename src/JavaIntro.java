//The first Java lesson

import java.util.Scanner;

public class JavaIntro {
    public static void main(String[] args) {
        //Integrated output class
        System.out.println("Welcome to Java Profession Lesson."); // ln -> next line

        //print
        System.out.print("Welcome to Java Profession Lesson with print"); //выведи мне сообщение и там же останься

        //print
        System.out.print("Welcome to Java.");
        System.out.print("This is the next line...");

        //println vs. print
        System.out.println(); // любой вывод требует чего то на выход - знак следующей строчки
        System.out.print(""); //error

        showTheSeasonOfTheYear(1);
        showTheSeasonOfTheYear(2);
        showTheSeasonOfTheYear(3);
        showTheSeasonOfTheYear(4);
        showTheSeasonOfTheYear(5);
        showTheSeasonOfTheYear(6);
        showTheSeasonOfTheYear(7);
        showTheSeasonOfTheYear(8);
        showTheSeasonOfTheYear(9);
        showTheSeasonOfTheYear(10);
        showTheSeasonOfTheYear(11);
        showTheSeasonOfTheYear(12);
        showTheSeasonWithIfElse(1);
        showEvenOrOddNumbers();
        showTheWeather();
        callTheColourOfTheRainbow();
    }

    public static void showTheSeasonOfTheYear(int month) {

        switch (month) {
            case 1, 2, 12:
                System.out.println("This is winter");
                break;
            case 3, 4, 5:
                System.out.println("This is spring");
                break;
            case 6, 7, 8:
                System.out.println("This is summer");
                break;
            case 9, 10, 11:
                System.out.println("This is autumn");
                break;
            default:
                System.out.println("There is no such month of the year...");
                break;
        }
    }

    public static void showTheSeasonWithIfElse(int month) {

        if (month < 3) {
            System.out.print("It's winter");
        }
        if (month == 3) {
            System.out.print("It's spring");
        }
        if (month == 4) {
            System.out.print("It's spring");
        }
        if (month == 5) {
            System.out.print("It's spring");
        }
        if (month == 6) {
            System.out.print("It's summer");
        }
        if (month == 7) {
            System.out.print("It's summer");
        }
        if (month == 8) {
            System.out.print("It's summer");
        }
        if (month == 9) {
            System.out.print("It's autumn");
        }

        if (month == 10) {
            System.out.print("It's autumn");
        }
        if (month == 11) {
            System.out.print("It's autumn");
        }
        if (month == 12) {
            System.out.print("It's winter");
        } else if (month > 12) {
            System.out.print("There is no such a month of the year");
        }
    }

    public static void showEvenOrOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd");
        }
    }

    public static void showTheWeather() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature:");
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.print("It's warm");
        }
        if ((-20 < t) && (t <= -5)) {
            System.out.print("It's normal");
        }
        if (t < -20) {
            System.out.print("It's cold");
        }
    }

    public static void callTheColourOfTheRainbow() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number from 1 to 7:");
        int colour = scanner.nextInt();

        switch (colour) {
            case 1:
                System.out.println("It's red");
                break;
            case 2:
                System.out.println("It's orange");
                break;
            case 3:
                System.out.println("It's yellow");
                break;
            case 4:
                System.out.println("It's green");
                break;
            case 5:
                System.out.println("It's light blue");
                break;
            case 6:
                System.out.println("It's blue");
                break;
            case 7:
                System.out.println("It's purple");
                break;

            default:
                System.out.println("There is no such a colour of the rainbow...");
                break;
        }
    }
}
