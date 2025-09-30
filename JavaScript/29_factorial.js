function factorial(n) {
    resultado = 1;

        if (n < 0 || isNaN(n)) {
            throw new Error(`ERROR: El valor "${n}" no tiene factorial`);
        }

        if (n == 0)
            return 1;

        for (i = 2; i <= n; i++){
            resultado = resultado*i;
        }
        return resultado;
}

console.log(factorial(5)); // 120
console.log(factorial(0)); // 1
console.log(factorial(7));
console.log(factorial(-7));
