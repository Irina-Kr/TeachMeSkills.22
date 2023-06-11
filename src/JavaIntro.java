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

    }

    public class Card {

        public String numberOfTheCard;
        public double currentBalance;

        public Card(String numberOfTheCard, double currentBalance) {
            this.numberOfTheCard = numberOfTheCard;
            this.currentBalance = currentBalance;
        }

        public void addASumToTheCard(double sum) {
            currentBalance += sum;
        }
        public void subtractASumFromTheCard(double sum1) {
            if (sum1 <= currentBalance) {
                currentBalance -= sum1;
                System.out.println("Your current balance is:");
            } else {
                System.out.println("There is not enough money on your account.");
            }
        }

        public String getCardInformation() {
            return "Card number is:" + this.numberOfTheCard + "\n" +
                    "Your current balance is:" + this.currentBalance + "\n";
        }

        public class MyCard {
            public void main(String[] args) {

                Card visa = new Card("1234 3214 2784 3187", 357.0);
                Card mastercard = new Card("9685 3525 1784 2816", 185.0);
                Card belcard = new Card("2731 8594 2814 3286", 817.0);
                visa.getCardInformation();
                System.out.println();
                mastercard.getCardInformation();
                System.out.println();
                belcard.getCardInformation();
                System.out.println();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the sum of money to add:");
                double sum2 = scanner.nextDouble();
                visa.addASumToTheCard(sum2);
                System.out.println("Enter the sum of money to add:");
                double sum3 = scanner.nextDouble();
                mastercard.addASumToTheCard(sum3);
                System.out.print("Enter the sum of money to subtract:");
                double sum1 = scanner.nextDouble();
                belcard.subtractASumFromTheCard(sum1);

                System.out.println();

                System.out.println(visa.getCardInformation());
                System.out.println();
                System.out.println(mastercard.getCardInformation());
                System.out.println();
                System.out.println(belcard.getCardInformation());
            }
        }


    }
}

