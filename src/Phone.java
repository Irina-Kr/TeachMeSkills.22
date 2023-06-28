//The first Java lesson

public class Phone {

    public int number;
    public String model;
    public double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

    }

    public Phone(int number, String model) {
        this(number, model, 0);
    }

    public Phone() {
        this(0, "Hidden", 0.0);
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling on " + this.model);
    }

    public void receiveCall(String callerName, int number) {
        System.out.println(callerName + " is calling on " + this.model);
        System.out.println(callerName + "'s number is " + number);
    }

    public void sendMessage(int... number) {
        System.out.println("Send messages to numbers: ");

        for (int a = 0; a < number.length; a++) {
            System.out.println(number[a]);
        }
    }

    public int getNumber() {
        return number;

    }

    @Override
    public String toString() {
        return "number is " + this.number + "\n" + "The model is " + this.model + "\n" + "The weight is " + this.weight;
    }


}
