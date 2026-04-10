import java.util.*;
import java.util.stream.*;

public class UC13 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) list.add(i);

        long start1 = System.nanoTime();
        for (int i : list) {
            if (i > 50000) {}
        }
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        list.stream().filter(i -> i > 50000).toList();
        long end2 = System.nanoTime();

        System.out.println("Loop: " + (end1 - start1));
        System.out.println("Stream: " + (end2 - start2));
    }
}