

public class CheckPrime {

    // Optimized prime-checking method using square-root logic
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        // Loop only up to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 29; 
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
