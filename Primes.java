public class Primes {
    public static void main(String[] args) {

        // gets the input for which we want to find all the prime numbers.
         int n = Integer.parseInt(args[0]);
        
        boolean [] isPrime = new boolean [n+1]; // n+1 to also count the prime number
        for (int i = 0; i < isPrime.length; i++) {
            isPrime [i] = true;
         } // first assume that all numebrs are prime numbers
         // 0 and 1 are not prime numbers 
            isPrime [0] = false;
            isPrime [1] = false;

            int limit = (int) Math.sqrt(n); // 

            // Eliminates all the multiples of each prime
            int p = 2; // nao entendi 
            while (p <= limit) {
                if (isPrime[p]) {
                    // Eliminates all multiples of p
                    int multiple = p + p;
                    while (multiple <= n) {
                        isPrime[multiple] = false;
                        multiple += p;
                    }
                }
                p++; // Move to the next number
            }
    
            // Print out the prime numbers
            System.out.println("Prime numbers up to " + n + ":");
            int N = 0;
            for (int i = 2; i <= n; i++) {
                if (isPrime[i]) {
                    System.out.println(i);
                }
            }
    
            // Count the number of primes
            int count = 0;
            for (int i = 2; i <= n; i++) {
                if (isPrime[i]) {
                    count++;
                }
            }
    
            System.out.println("There are " + count + " primes between 2 and " + n + " (" + (100 * count / n) + "% are primes)");
        }
    }

    
    
    