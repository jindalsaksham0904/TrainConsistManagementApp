import java.util.*;

public class UC10 {
    public static void main(String[] args) {
        List<Integer> seats = Arrays.asList(72, 60, 80, 50);

        int total = seats.stream().reduce(0, Integer::sum);

        System.out.println("Total Seats: " + total);
    }
}