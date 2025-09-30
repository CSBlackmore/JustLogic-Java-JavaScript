function countIntegers(items) {
  
let totalEnteros = [];

for (const elemento of items) {
  if(!isNaN(elemento)) {
    totalEnteros.push(elemento);
  } 
  else
    console.log(`${elemento} no es un número`);
}
  return totalEnteros.length;
}

console.log(countIntegers([1, "a", 2, "b", 3])); // 3
