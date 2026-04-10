import java.util.*;
import java.util.stream.*;

public class UC8 {
    public static void main(String[] args) {
        List<Integer> capacities = Arrays.asList(50, 80, 120, 40);

        List<Integer> result = capacities.stream()
                .filter(c -> c > 70)
                .collect(Collectors.toList());

        System.out.println("High Capacity Bogies: " + result);
    }
}