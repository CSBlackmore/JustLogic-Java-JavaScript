function getOdds(numbers) {
    return numbers.filter(n => n % 2 !== 0);
}

// Pruebas con código duro
console.log(getOdds([1, 2, 3, 4, 5]));   // Esperado: [1, 3, 5]
console.log(getOdds([10, 11, 12, 13, 14])); // Esperado: [11, 13]
