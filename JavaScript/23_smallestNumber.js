function findSmallest(numbers) {
    let smallest = numbers[0];
    for (let elemento of numbers) {
        if (elemento < smallest) {
            smallest = elemento;
        }
    }
    return smallest;
}

// Pruebas con código duro
console.log(findSmallest([4, 2, 7, 1, 9]));  // Esperado: 1
console.log(findSmallest([-3, -7, 0, 5, 2])); // Esperado: -7
