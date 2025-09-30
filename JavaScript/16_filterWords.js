function filterWords(words) {
  const vocalesInicio = /^[aeiou]/i;
  return words.filter(conVocal => vocalesInicio.test(conVocal));
}

console.log(filterWords(["apple", "dog", "orange", "cat"])); // ["apple", "orange"]
