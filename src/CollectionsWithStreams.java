import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CollectionsWithStreams {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(30));
        }
        System.out.println("Original ArrayList" + arrayList);
        List<Integer> uniqueElements = arrayList.stream()
                .distinct()
                .toList();
        System.out.println(" ArrayList without duplicates :" + uniqueElements);
        List<Integer> evenElements = arrayList.stream()
                .filter(num -> num >= 7 && num <= 17 && num % 2 == 0)
                .toList();
        System.out.println(" ArrayList of even elements from 7 to 17:" + evenElements);
        List<Integer> multipliedByTwoElements = arrayList.stream()
                .map(i -> i * 2)
                .toList();
        System.out.println(" ArrayList of the elements multiplied by 2:" + multipliedByTwoElements);
        List<Integer> sortedAndLimitedList = arrayList.stream()
                .sorted()
                .limit(4)
                .toList();
        System.out.println(" ArrayList of 4 first sorted elements :" + sortedAndLimitedList);
        long numberOfElements = arrayList.stream().count();
        double average = arrayList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("Number of elements:" + numberOfElements);
        System.out.println("Average of elements:" + average);

    }
}