import java.util.*;

public class UC12 {

    static class Bogie {
        String type;
        String cargo;

        Bogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {
        List<Bogie> list = Arrays.asList(
                new Bogie("Cylindrical", "Petroleum"),
                new Bogie("Rectangular", "Coal")
        );

        boolean safe = list.stream().allMatch(b ->
                !(b.type.equals("Rectangular") && b.cargo.equals("Petroleum"))
        );

        System.out.println("Safety: " + safe);
    }
}