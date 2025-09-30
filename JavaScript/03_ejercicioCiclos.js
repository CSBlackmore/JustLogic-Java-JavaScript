/* Imprimir los primeros 10 números de 3 en 3 
1, 4, 7,10 y 1, -2, -5, -8 */
const LIMITE_1 = 10;
const LIMITE_2 = -10;

for (let contador = 1; contador <= LIMITE_1; contador += 3) {
    console.log(contador);
}
for (let contador = 1; contador > LIMITE_2; contador -= 3) {
    console.log(contador);
}

// Realizar suma acumulativa de los números de 1 a 5 con todos los ciclos
// Ciclo **FOR**
let numeros = [1, 2, 3, 4, 5];
let sumaTotal = 0

for (let valorInicial = 0; valorInicial < numeros.length; valorInicial++) {
    sumaTotal += numeros[valorInicial]
    console.log(sumaTotal);
}

// Solución profesor 

let maximo = 5
let acumuladoSuma = 0;

for (let numero = 1; numero <= maximo; numero++) {
    // breaking it out
    console.log(`${acumuladoSuma} + ${numero}`);
    acumuladoSuma += numero
    console.log(acumuladoSuma);
}

// Ciclo **WHILE** profesor
let maximo1 = 5
let acumuladoSuma1 = 0;
let numero1 = 1;

while (numero1 <= maximo1) {
    console.log(`${acumuladoSuma1} + ${numero1}`);
    acumuladoSuma1 += numero1;
    console.log(acumuladoSuma1)
    numero1++;
}

// Ciclo **DO WHILE** profesor
let maximo2 = 5
let acumuladoSuma2 = 0;
let numero2 = 1;

do {
    console.log(`${acumuladoSuma2} + ${numero2}`);
    acumuladoSuma2 += numero2;
    console.log(acumuladoSuma2)
    numero1++;
} while (numero2 <= maximo2);
