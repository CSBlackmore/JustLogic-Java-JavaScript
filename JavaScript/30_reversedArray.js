function reverseList(arr) {
    if (arr.length === 0) {
        return "No se puede invertir un array vacío";
    }

    return arr.reverse();
}

console.log(reverseList([1,2,3,4,5])); // [5,4,3,2,1]
