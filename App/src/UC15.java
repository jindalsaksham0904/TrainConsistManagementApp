public class UC15 {

    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String msg) {
            super(msg);
        }
    }

    public static void main(String[] args) {
        String shape = "Rectangular";
        String cargo = "Petroleum";

        try {
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo!");
            }
            System.out.println("Safe");
        } catch (CargoSafetyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Done");
        }
    }
}