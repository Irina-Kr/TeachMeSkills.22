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
         createThreeDimensionalArray();
        paintTheChessBoard();
    }

    public static void createThreeDimensionalArray() {
        int[][][] myArray = new int[][][]
                {
                        {
                                {5, 1, 7}
                        },
                        {
                                {15, 9, 11},
                                {3, 6, 13}
                        },
                        {
                                {4, 8, 25, 17, 3},
                                {12, 0, 6, 24, 3},
                                {13, 2, 0, 9, 4}
                        },
                        {
                                {2, 1, 4, 7, 2, 9, 24}
                        },
                        {
                                {3, 12, 7},
                                {5, 2, 10}

                        }
                };
        System.out.println(Arrays.deepToString(myArray));
        //add a number to the array.
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Please,enter the number:");
        number = scanner.nextInt();
        for (int a = 0; a < myArray.length; a++) {
            for (int b = 0; b < myArray[a].length; b++) {
                for (int c = 0; c < myArray[a][b].length; c++) {
                    myArray[a][b][c] += number;
                }
            }
        }
        System.out.println(Arrays.deepToString(myArray));
    }

    public static void paintTheChessBoard() {
        String[][] chessBoard = new String[8][8];
        for (int x = 0; x < chessBoard.length; x++) {
            for (int y = 0; y < chessBoard.length; y++) {
                if ((x + y) % 2 == 0) {
                    chessBoard[x][y] = "W";
                } else {
                    chessBoard[x][y] = "B";
                }
            }
        }
        for (int x = 0; x < chessBoard.length; x++) {
            for (int y = 0; y < chessBoard.length; y++) {
                System.out.print(chessBoard[x][y] + " ");
            }
            System.out.println();
        }
    }
}