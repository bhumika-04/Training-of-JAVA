// Exception Handling — handling runtime errors gracefully

// Custom exception
class InvalidAgeException extends Exception {

    InvalidAgeException(String msg) {
        super(msg);
    }
}

class ExceptionHandling {

    // method that throws custom exception
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is not valid. Must be 18+");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {

        // ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block always runs");
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // Custom exception
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }

        try {
            checkAge(20);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }
    }
}
