public class IsPrime {
    public static boolean isPrime(int n) {

        if (n <= 1 || n > 2 && n % 2 == 0) {
            return false;
        }
        else if (n == 2) {
            return true;
        }

        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
        
    }
    

    public static void main(String[] args) {
        System.out.println(isPrime(2));  // true
        System.out.println(isPrime(15)); // false
        System.out.println(isPrime(17)); // true
        System.out.println(isPrime(0));
        System.out.println(isPrime(43));
        System.out.println(isPrime(59));
        System.out.println(isPrime(4));
        System.out.println(isPrime(10));
        System.out.println(isPrime(27));
    }
}
