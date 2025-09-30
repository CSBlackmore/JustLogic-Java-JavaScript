function process(items) {
  let enterosPares = [];
  let palabrasLargas = [];

  for (let elemento of items) {
    if (typeof elemento === "number" && elemento % 2 === 0) {
        enterosPares.push(elemento);
    }
    else if (elemento.length > 3) {
        palabrasLargas.push(elemento);
    }
  }
  console.log(`enteros pares = ${enterosPares}, palabras largas = ${palabrasLargas}`);
}

process([1, "hi", 2, "hola", 3, "world", 4]);
// esperado: enteros pares=[2,4], palabras largas=["hola","world"]
