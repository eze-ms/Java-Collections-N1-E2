import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList<>();

        firstList.add(10);
        firstList.add(20);
        firstList.add(30);
        firstList.add(40);
        firstList.add(50);

        System.out.println("Primera lista: " +firstList);

        List<Integer> secondList = new ArrayList<>();

        ListIterator<Integer> iterator = firstList.listIterator(firstList.size());
        while (iterator.hasPrevious()) {
            secondList.add(iterator.previous());
        }

        System.out.println("Segunda lista (orden inverso): " + secondList);
    }
}