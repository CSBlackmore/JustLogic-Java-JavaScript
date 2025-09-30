function findLongest(words) {
    let longest = words[0];

    for (element of words) {
        if (element.length > longest.length) {
            longest = element;
        }
    }
    return longest;
}

// Pruebas con código duro
console.log(findLongest(["dog", "cat", "elephant", "ant"])); // Esperado: "elephant"
console.log(findLongest(["red", "blue", "green"]));          // Esperado: "green"
