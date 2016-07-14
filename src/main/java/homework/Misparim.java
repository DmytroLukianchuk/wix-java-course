package homework;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 Task#2:
 Write a program called Misparim which prints the numbers 1 to 20 as follows:
 First row - all the numbers which are multiples of 2
 Second row - all the numbers which are multiples of 3
 Third row - all the numbers which are multiples of 4
 */

public class Misparim {

    public List<Integer> generateList(int userNumber) {
        return IntStream.rangeClosed(1, userNumber)
                .boxed()
                .collect(Collectors
                        .toList());
    }

    public List<Integer> filterByMultiple(int num, List<Integer> list) {
        return list.stream()
                .filter(i -> i % num == 0)
                .collect(Collectors
                        .toList());
    }

    public static void main(String[] args) {
        Misparim misparim = new Misparim();
        List<Integer> list = misparim.generateList(20);
        System.out.println(misparim.filterByMultiple(2, list));
        System.out.println(misparim.filterByMultiple(3, list));
        System.out.println(misparim.filterByMultiple(4, list));
    }
}
