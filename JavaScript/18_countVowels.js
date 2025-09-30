function countVowels(text) {
    let totalVocales = 0;

    for (indice = 0; indice < text.length; indice++) {
        let vocal = text[indice];

        switch (vocal) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            totalVocales ++;
        }
    }
    return totalVocales;
}

// Test
console.log(countVowels("hello world")); // esperado: 3
