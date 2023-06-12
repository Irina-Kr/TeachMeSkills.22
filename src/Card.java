//The first Java lesson


    public class Card {

        private String numberOfTheCard;
        private double currentBalance;

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





    }


