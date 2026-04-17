import java.util.*;

public class UC20 {
    public static void main(String[] args) {

        List<String> bogieIds = new ArrayList<>();
        // Try changing this:
        // bogieIds.add("BG101");

        String searchId = "BG101";

        // Defensive check
        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: No bogies available in train");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie Found: " + searchId);
        } else {
            System.out.println("Bogie Not Found");
        }
    }
}