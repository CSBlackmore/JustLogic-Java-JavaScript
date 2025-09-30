function isPrime(n) {

    if (n <= 1 || n > 2 && n % 2 == 0) {
            return false;
        }
        else if (n === 2) {
            return true;
        }

        for (i = 3; i <= Math.sqrt(n); i+=2) {
            if (n % i === 0) {
                return false;
            }
        }

        return true;
}

console.log(isPrime(2));  // true
console.log(isPrime(15)); // false
console.log(isPrime(17)); // true
console.log(isPrime(27));
console.log(isPrime(23));
console.log(isPrime(0));
console.log(isPrime(9));