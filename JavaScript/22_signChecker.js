function checkSign(num) {
    // TU LÓGICA AQUÍ
    if (num === 0) {
            return "zero";
        } else if (num > 0 ) {
            return "positive";
        } 
        else {
            return "negative";
        }
}

// Pruebas con código duro
console.log(checkSign(5));   // Esperado: "positive"
console.log(checkSign(-3));  // Esperado: "negative"
console.log(checkSign(0));   // Esperado: "zero"
