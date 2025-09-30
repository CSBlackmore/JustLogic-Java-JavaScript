function process(items) {
  let suma = 0;
  let concatenado = "";

  for (let elemento of items) {
    if (typeof elemento === 'number') {
        suma += elemento;
    }
    else if (typeof elemento === 'string') {
        concatenado += elemento + " ";
    }
  }
  console.log(`Suma = ${suma} concatenado = "${concatenado}"`);
}

process([1, "hola", 2, "mundo", 3]);
// esperado: suma=6, concatenado="holamundo"
