function countEvenOdd(numbers) {
    let evens = 0, odds = 0;
    for (let number of numbers) {
        if (number % 2 === 0) {
            evens++;
        }
        else {
            odds++;
        }
    }
    return { evens, odds}; // placeholder
}

// prueba
console.log(countEvenOdd([1,2,3,4,5,6])); // esperado: {evens:3, odds:3}
