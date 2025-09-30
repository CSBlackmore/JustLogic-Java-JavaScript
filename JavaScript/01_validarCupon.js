/* Crea un programa que reciba el precio de un producto, la cantidad que se quiere comprar 
y si el usuario tiene un cupón de descuento.
Aplica un descuento del 10% si tiene cupón.
Calcula el precio total con IVA (19%).
Verifica si la cantidad es válida (debe ser mayor a 1).
Muestra el total, el descuento aplicado, y el total con IVA.
Usa operadores de comparación, asignación, aritméticos, incremento, decremento y lógicos. */

let precio = 100;
let cantidad = 5;
let cupon = true;
let descuento = 0.90;                                                                                                                                                                                                               
const IVA = 19;
let precioSinIVA = precio * cantidad;
let precioConIVA = precio * cantidad * (1+IVA/100);
let precioConDescuento = precio * cantidad * descuento;
let precioTotal = precioConDescuento * (1+IVA/100);

if (cantidad <= 1) {
    console.log('Cantidad no válida para descuento')
} else if (cupon) {
    console.log(`El valor total con IVA es $${precioConIVA.toFixed(2)}`);
    console.log(`El valor con descuento sin IVA es $${precioConDescuento.toFixed(2)}`);
    console.log(`El valor total con descuento y con IVA es $${precioTotal.toFixed(2)}`);
} else if (!cupon) {
    console.log(`El valor total sin IVA es $${precioSinIVA.toFixed(2)}`);
    console.log(`El valor total con IVA es $${precioConIVA.toFixed(2)}`);
}

// version refactorizada

let precio1 = 100;
let cantidad1 = 5;
let cupon1 = true;
const IVA1 = 0.19;

if (cantidad <= 1) {
    console.log("Cantidad no válida para descuento");
} else {
    let subtotal = precio1 * cantidad1;

    if (cupon) {
        let descuento = subtotal * 0.10;
        let precioConDescuento = subtotal - descuento;
        let precioTotal = precioConDescuento * (1 + IVA/100);

        console.log(`Subtotal: $${subtotal.toFixed(2)}`);
        console.log(`Descuento (10%): $${descuento.toFixed(2)}`);
        console.log(`Total con descuento e IVA: $${precioTotal.toFixed(2)}`);
    } else {
        let precioTotal = subtotal * (1 + IVA/100);
        console.log(`Subtotal sin descuento: $${subtotal.toFixed(2)}`);
        console.log(`Total con IVA: $${precioTotal.toFixed(2)}`);
    }
}
