package Data_Structures_And_Algorithms.Arrays_Problems;

public class PrimeNumbersFrom1toN {
    public static int countPrimeNumbersFrom1toN(int n) {
        if (n < 2) {
            return 0;
        }
        boolean[] sieve = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            sieve[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            if (sieve[p]) {
                for (int multiple = 2*p; multiple <= n; multiple += p) {
                    sieve[multiple] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (sieve[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 20;
        int primeCount = countPrimeNumbersFrom1toN(n);
        System.out.println("Number of prime numbers from 1 to " + n + " is: " + primeCount);
    }
}

// TC: O(N log log N)
// SC: O(N) because of the boolean array
