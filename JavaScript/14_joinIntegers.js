function joinIntegers(items) {
  let soloNumeros = "";

  for (let elemento of items) {
    if (typeof elemento === 'number') {
        if (soloNumeros.length > 0) {
            soloNumeros += ",";
        }
        soloNumeros += elemento;
    }
  }
  return soloNumeros;
}

console.log(joinIntegers([1, "a", 2, "b", 3])); // "1,2,3"
