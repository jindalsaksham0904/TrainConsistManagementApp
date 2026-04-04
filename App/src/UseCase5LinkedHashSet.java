import java.util.*;

public class UseCase5LinkedHashSet {

    public static void main(String[] args) {

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");

        System.out.println("Train Formation: " + formation);
    }
}