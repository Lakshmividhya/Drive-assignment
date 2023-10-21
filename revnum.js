function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    let words = sentence.split(' ');

    // Reverse each word and store them in a new array
    let reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    // Join the reversed words to form the reversed sentence
    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

// Input a sentence
const sentence = "This is a sunny day"; // Replace with your input sentence

// Call the function to reverse the words
const reversed = reverseWordsInSentence(sentence);

// Display the reversed sentence
console.log("Reversed sentence: " + reversed);
