function filterEvens(numbers) {
  let evensOnlyArray = [];
  for (const elemento of numbers) {
    if (elemento % 2 === 0) {
        evensOnlyArray.push(elemento);
    }
  }
  return evensOnlyArray;
}

console.log(filterEvens([1, 2, 3, 4, 5, 6])); // [2, 4, 6]
