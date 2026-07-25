public class CheckPrime {

    // Unoptimized O(N) prime-checking method
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        // Loop all the way up to n-1
        for (int i = 2; i < n; i++) {
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
}