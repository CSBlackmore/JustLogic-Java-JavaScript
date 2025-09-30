function isVowel(c) {
  const vocales = "aeiouAEIOU";
  return vocales.includes(c);
}

console.log(isVowel('a')); // true
console.log(isVowel('z')); // false
