import java.util.*;

public class UseCase3HashSet {

    public static void main(String[] args) {

        Set<String> ids = new HashSet<>();

        ids.add("BG101");
        ids.add("BG102");
        ids.add("BG101");

        System.out.println("Unique Bogies: " + ids);
    }
}