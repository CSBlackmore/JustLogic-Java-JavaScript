function reverse(text) {
    if (text.length === 0) {
        return text;
    }

    let palabrasDeTexto = text.split(" ");
    let textoInvertido = [];

    for (i = 0; i < palabrasDeTexto.length; i++) {
        let palabraNueva = palabrasDeTexto[i];
        let palabraInvertida = palabraNueva.split("").reverse().join("");
        textoInvertido.push(palabraInvertida);
    }
    return textoInvertido.join();
}

// Test
console.log(reverse("hello")); // esperado: "olleh"
