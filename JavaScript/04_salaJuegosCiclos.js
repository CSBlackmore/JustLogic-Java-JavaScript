/*Imagina que tienes una sala de videojuegos con las siguientes reglas:

    Se permite el acceso de 10 personas como máximo por turno. 

    A cada persona se le asigna un número de ficha del 1 al 10. FOR

    Una vez termina el turno, se hace una verificación para saber si hay más personas en la fila. 
    Si hay, se repite el proceso. DO WHILE

    Si en algún momento se detecta que no hay más personas en fila, 
    se cierra la sala y se imprime un mensaje de despedida. WHILE */

//     INICIALIZAR maxPersonas = 10
// INICIALIZAR personasFila = 20
// INICIALIZAR personasSala = 0

// MIENTRAS personasFila > 0
//     // FASE 1: llenar sala
//     PARA i desde personasSala hasta maxPersonas
//         SI personasFila > 0
//             personasFila--
//             personasSala++
//             mostrar("entra una persona")
//         SINO
//             mostrar("fila vacía, cerramos sala")
//             SALIR del bucle principal
//     FIN PARA

//     mostrar("sala llena con " + personasSala)

//     // FASE 2: ciclo sala llena
//     HACER
//         personasSala--
//         SI personasFila > 0
//             personasFila--
//             personasSala++
//             mostrar("entra alguien de la fila")
//         FIN SI
//     MIENTRAS personasFila > 0 Y personasSala == maxPersonas
// FIN MIENTRAS


let maxPersonas = 10;
let personasFila = 20;
let personasEnSala = 0;

// Primer llenado de la sala
for (; personasEnSala < maxPersonas;) {
    if (personasFila > 0) {
        personasFila--;
        personasEnSala++;
    }
}

console.log(`Sala llena con ${personasEnSala} personas`);

// Simular personas que salen y entran
    do {
        console.log("Alguien sale de la sala");
        personasEnSala--;
        console.log(`Personas en sala: ${personasEnSala}. Personas en fila: ${personasFila}`) 
        if (personasFila > 0) {
            personasFila--;
            personasEnSala++;
            console.log("Alguien entra de la fila");
        }

    } while (personasFila > 0 && personasEnSala == maxPersonas);
do {
    personasEnSala--
    console.log(`Personas en sala: ${personasEnSala}`);
} while (personasEnSala > 0);
// Mensaje final
if (personasEnSala == 0) {
    console.log(`Personas en sala: ${personasEnSala}. Personas en fila: ${personasFila}. La sala se cierra.`)
}
