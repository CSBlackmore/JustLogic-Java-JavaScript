function sumEvens(numbers) {
  let suma = 0;

for (const numero of numbers) {
    if (numero % 2 === 0) {
        suma += numero;
    }
}

  return suma;
}

console.log(sumEvens([1, 2, 3, 4, 6])); // 12
