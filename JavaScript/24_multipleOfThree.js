function checkMultiple(num) {
    return (num % 3 == 0) ? "multiple of 3" : "not multiple of 3";
}

// Pruebas con código duro
console.log(checkMultiple(9));   // Esperado: "multiple of 3"
console.log(checkMultiple(10));  // Esperado: "not multiple of 3"
console.log(checkMultiple(0));   // Esperado: "multiple of 3"
