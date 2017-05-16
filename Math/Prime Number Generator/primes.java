/* Generates the next prime number when get_prime() is called

To compile:
javac primes.java

To run:
java PrintNumber
 */
 
class PrimeNumber {
    int current_number = 2;
    
    // Returns the next prime number
    public int get_prime() {
        if (current_number == 2) {
            current_number += 1;
            return 2;
        } else {
            int temp;
            
            while (true) {
                if (is_prime(current_number)) {
                    temp = current_number;
                    current_number += 1;
                    
                    return temp;
                } else {
                    current_number += 1;
                }
            }
        }
    }
    
    // Returns True or False is a number is prime or not
    private boolean is_prime(int n) {
        for (int i = 2; i <= (n + 1)/2; i++) {
            // n is divisible by some factor --> Is not prime

            if (n % i == 0) {
                return false;
            }
        }
        
        // No factors found
        return true;
    }
}

class PrintNumber {
    public static void main(String args[]) {
        // Instantiate a prime number generator
        PrimeNumber meme_gen = new PrimeNumber();
        
        // Print the first 20 primes
        for (int i = 0; i < 20; i++) {
            System.out.println("Prime: " + meme_gen.get_prime());
        }
    }
}