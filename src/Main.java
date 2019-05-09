public class Main {

    public static void main(String[] args) {
        int sum = 0;
        // The array to work on
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        // Get each number from the array
        for (int n : myArray) {
            // Check to determine if it is a prime number
            if (isPrime(n)) {
                // Sum up the prime numbers
                sum += n;
                System.out.println(sum);
            }
        }
    }

    private static boolean isPrime(int n) {
        // Exclude 0 and 1 cos they are not prime numbers
        if (n <= 1){
            return false;
        }
        // Identify the actual prime numbers from the array
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}