function isAnagram(a, b) {
    
    let palabra1 = a.toLowerCase().split('').sort().join('');
    let palabra2 = b.toLowerCase().split('').sort().join('');

    return palabra1 === palabra2;
}

console.log(isAnagram("listen","silent")); // true
console.log(isAnagram("hello","world"));   // false
