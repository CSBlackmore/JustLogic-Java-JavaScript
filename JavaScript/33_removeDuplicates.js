function removeDuplicates(arr) {
    
    let uniqueItems = [];

    for (number of arr) {
        if(!uniqueItems.includes(number)) {
            uniqueItems.push(number);
        }
    }

    return uniqueItems;
}

console.log(removeDuplicates([1,2,2,3,1,4])); // [1,2,3,4]
