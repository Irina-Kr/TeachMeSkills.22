// The first Java Lesson

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(3742586, "samsung", 120);
        Phone phone2 = new Phone(2751394, "huawei", 100);
        Phone phone3 = new Phone(5361894, "xiaomi", 130);

        System.out.println("The first phone's " + phone1);
        System.out.println();
        System.out.println("The second phone's " + phone2);
        System.out.println();
        System.out.println("The third phone's " + phone3);
        System.out.println("**************************************************************************************");
        phone1.receiveCall(" George ");
        phone2.receiveCall("Mom ");
        phone3.receiveCall("Honey ");
        System.out.println("**************************************************************************************");
        phone1.receiveCall("Kate", 3752863);
        phone2.receiveCall("Paul", 2831658);
        phone3.receiveCall("Peter", 7321457);
        System.out.println();
        phone1.sendMessage(3591884, 3854890, 9431321, 5231796);
        phone2.sendMessage(1458764, 3809317, 6589311, 3182370);
        phone3.sendMessage(3145619, 2953880, 3152804, 5182111);
    }
}
