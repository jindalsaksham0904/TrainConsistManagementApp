import java.util.regex.*;

public class UC11 {
    public static void main(String[] args) {
        String trainId = "TRN-1234";
        String cargo = "PET-AB";

        boolean trainValid = Pattern.matches("TRN-\\d{4}", trainId);
        boolean cargoValid = Pattern.matches("PET-[A-Z]{2}", cargo);

        System.out.println(trainValid);
        System.out.println(cargoValid);
    }
}