public class UC14 {

    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String msg) {
            super(msg);
        }
    }

    public static void main(String[] args) {
        try {
            int capacity = -10;

            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be > 0");
            }

        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}