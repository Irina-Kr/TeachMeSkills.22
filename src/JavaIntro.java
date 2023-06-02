//The first Java lesson

import java.util.Arrays;
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
        showIfTheNumberIncludedInTheArray();
        removeTheNumberFormTheArray();
        createArrayOfRandomNumbers();
        compareTwoArrays();

    }

    public static void showIfTheNumberIncludedInTheArray() {
        int[] numbers = new int[5];
        numbers[0] = 3;
        numbers[1] = 6;
        numbers[2] = 11;
        numbers[3] = 33;
        numbers[4] = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please,enter your number:");
        int number = scanner.nextInt();
        boolean included = false;
        for (int x = 0; x < 5; x++) {
            if (numbers[x] == number) {
                included = true;
                break;
            }
        }
        if (included) {
            System.out.println("Your number is included in the array.");
        } else {
            System.out.println("Your number is not included in the array");
        }
    }

    public static void removeTheNumberFormTheArray() {
        int[] numbers = new int[5];
        numbers[0] = 3;
        numbers[1] = 6;
        numbers[2] = 11;
        numbers[3] = 33;
        numbers[4] = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please,enter your number:");
        int number = scanner.nextInt();
        int counter = 0;
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] == number) {
                counter++;
            }
            if (counter == 0) {
                System.out.println(number + "\t" + "is not included in the array");
                break;
            }
            int[] numbersN = new int[numbers.length - counter];
            int counterN = 0;
            for (x = 0; x < numbers.length; x++) {
                if (numbers[x] != number) {
                    numbersN[counterN] = numbers[x];
                    counterN++;
                }
            }
            System.out.println("New array without the number :");
            for (x = 0; x < numbersN.length; x++) {
                System.out.println(numbersN[x] + " ");
            }
            System.out.println();
        }
    }
    public static void createArrayOfRandomNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array :");
        int length = scanner.nextInt();
        int[] array1 = new int[length];
        for (int x = 0; x < length; x++) {
            array1[x] = (int) (Math.random() * 100);
        }
        System.out.println("The numbers of the array :");
        System.out.println(Arrays.toString(array1));
        int max = array1[0];
        int min = array1[0];
        int sum = array1[0];
        double average = 0;
        for (int x = 1; x < array1.length; x++) {
            if (array1[x] > max) {
                max = array1[x];
            }
            if (array1[x] < min) {
                min = array1[x];
            }
            sum = sum + array1[x];
            average = (double) sum / array1.length;
        }
        System.out.println("Maximum :" + max);
        System.out.println("Minimum:" + min);
        System.out.println("Average: " + average);
    }
    public static void compareTwoArrays() {
        int[] array1 = {5, 9, 3, 12, 7};
        int[] array2 = {8, 6, 14, 21, 0};

        int sum1 = array1[0];
        double average1 =0;
        for (int x = 0; x < array1.length;x++) {
            System.out.print("Array 1 :");
            System.out.println(Arrays.toString(array1));
            sum1 = sum1 + array1[x];
            average1 = (double) sum1 / array1.length;
            System.out.print("Average1:" + average1 + "\t ");
            break;
        }
        System.out.println();
        int sum2 = array1[0];
        double average2 = 0;
        for ( int x = 0; x < array2.length; x++) {
            System.out.print("Array2:");
            System.out.println(Arrays.toString(array2));
            sum2 = sum2 + array2[x];
            average2 = (double) sum2 / array2.length;
            System.out.println("Average2:" + average2 + " \t");
            break;
        }
        if (average1 > average2) {
            System.out.println("Average1 is bigger .");
        }
        else if (average1 < average2) {
            System.out.println("Average2 is bigger.");
        }
        else  {
            System.out.println("Both averages are equal");
        }
    }
}





