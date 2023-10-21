const originalArray = [5, 1, 9, 3, 7];

// Use the sort method with a custom compare function for descending order
const descendingArray = originalArray.sort((a, b) => b - a);

console.log("Original Array: " + originalArray);
console.log("Sorted Array (Descending): " + descendingArray);
