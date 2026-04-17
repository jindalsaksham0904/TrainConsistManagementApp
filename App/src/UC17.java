import java.util.Arrays;

public class UC17 {
    public static void main(String[] args) {

        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General"};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogies));

        Arrays.sort(bogies);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogies));
    }
}