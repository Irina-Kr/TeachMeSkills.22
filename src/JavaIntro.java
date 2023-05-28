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
        // showOddNumbers();
        // showReverseOrderOfNumbers();
        // getSumOfNumbers();
       // showTheSubsequenceOfNumbers();
        showTheSubsequenceOfNegativeNumbers();
    }

    public static void showOddNumbers() {
        for (int x = 1; x < 99; x++) {
            System.out.println("for x:" + x++);
            if (x % 2 != 0) {
                System.out.print("\n");
            }

        }
    }

    public static void showReverseOrderOfNumbers() {
        for (int x = 5; 1 <= x; x--) {
            System.out.println("x:" + x);
        }
    }

    public static void getSumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int x = scanner.nextInt();
        int sum = 0;
        for (int y = 1; y <= x; y++) {
            sum = sum + y;
        }
        System.out.print("sum:" + sum);
    }

    public static void showTheSubsequenceOfNumbers() {
        int x = 7;
        while (x <= 98) {
            System.out.print(x + " ");
            x = x + 7;
        }
    }

    public static void showTheSubsequenceOfNegativeNumbers() {
        int a = 0;
        while (-45 <= a) {
            System.out.print(a +" ");
            a = a - 5;
        }
    }
    }


