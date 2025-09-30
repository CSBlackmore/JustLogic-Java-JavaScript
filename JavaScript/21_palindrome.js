function isPalindrome(number) {
    if (number < 0) {
        return false;
    } 
    let enteroEnCadena = number.toString().split('').reverse().join('');
    let numeroInvertido = parseInt(enteroEnCadena); // convierte un valor de cadena (string) en un número entero.
    return numeroInvertido === number;
}

// Test
console.log(isPalindrome(121)); // esperado: true
console.log(isPalindrome(123)); // esperado: false
