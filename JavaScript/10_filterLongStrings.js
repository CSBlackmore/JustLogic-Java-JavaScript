function filterLong(words) {

    let masDeTres = [];

    for (const elemento of words) {
        if (elemento.length > 3) {
            masDeTres.push(elemento);
        } 
    }

  return masDeTres;
}

console.log(filterLong(["hi", "hola", "world", "yo"])); // ["hola", "world"]
