/* Crea un programa que simule el ingreso y salida de usuarios a una página. 
Usa variables para contar el número de usuarios actuales. 
Usa incremento y decremento. Asegúrate de que el número de usuarios no sea negativo. 
Muestra advertencias si el límite máximo se alcanza. */

/* 
1- Crear variable contador que registre cada usuario conectado
2- Crear constante de máximo de usuarios
3- Crear función ingreso - incremento con mensaje de alerta si está al 90%
4- Crear función egreso - decremento
    - Validar que el número de usuarios conectados no sea negativo 
*/
let usuariosConectados = 0;
const LIMITE_DE_USUARIOS = 100;

function ingresoUsuarios() { // se elimina el parámetro "usuariosConectados" bc afectaría solo variable local"
    if (usuariosConectados <= LIMITE_DE_USUARIOS) {
        console.log(`Bienvenido/a! Número de usuarios conectados: ${usuariosConectados}`)
        usuariosConectados ++;
    } else if (usuariosConectados = LIMITE_DE_USUARIOS) {
        console.log('Limite de usuarios alcanzado');
    }
}
function salidaDeUsuarios() { // se elimina el parámetro "usuariosConectados" bc afectaría solo variable local"
    if (usuariosConectados === LIMITE_DE_USUARIOS) { // en esta línea se cambió "=" por "==="
        usuariosConectados --;
        console.log(`Un usuario ha salido. Nuevo total de usuarios: ${usuariosConectados}`);
    } else if (usuariosConectados === 0) { // en esta línea se cambió "=" por "==="
        console.log('La página está vacía');
    } else if (usuariosConectados < 0) {
        console.log('Error en el contador de usuarios conectados');
    }
}

ingresoUsuarios();
salidaDeUsuarios();
