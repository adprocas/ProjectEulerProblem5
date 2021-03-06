package projecteulerproblem5;

public class ProjectEulerProblem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long limit = 20L;
        long startingNumber = limit * 19L;
        long factorialNumber = doFactorial(limit);

        for (long x = startingNumber; x <= factorialNumber; x += 20L) {
            if (checkMultiple(x, limit)) {
                System.out.println("The smallest positive number that is evenly divisible by all numbers from 1 to " + limit + " is " + x);

                break;
            }
        }
    }

    /**
     * @param number
     * @return long
     */
    public static long doFactorial(long number) {
        if (number > 1) {
            long prev = number * doFactorial(number - 1L);
            return prev;
        }

        return number;
    }

    /**
     * @param number
     * @param limit
     * @return long
     */
    public static boolean checkMultiple(long number, long limit) {
        for (long x = 1L; x <= limit; x++) {
            if (number % x != 0L) {
                return false;
            }
        }

        return true;
    }
}
