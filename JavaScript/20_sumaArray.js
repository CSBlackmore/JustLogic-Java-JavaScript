function sumArray(numbers) {
    sumaTotal = 0;
    for (let numero of numbers) {
        sumaTotal += numero
    }
    return sumaTotal;
}

// Test
console.log(sumArray([1, 2, 3, 4, 5])); // esperado: 15
