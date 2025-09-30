function average(numbers) {
    
    let total = 0;

    if (numbers.length === 0) {
        return 0.0;
    }

    for (elemento of numbers) {
        total += elemento;
    }

    return total / numbers.length;
}

console.log(average([2,4,6])); // 4
