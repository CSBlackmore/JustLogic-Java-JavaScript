function checkLength(text) {
  
  return (text.length > 5) ? "Long" : "Short";
}

console.log(checkLength("hola")); // short
console.log(checkLength("programacion")); // long
