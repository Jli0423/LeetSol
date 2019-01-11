// Shit solution 1
/*
 * @param {string[]} words
 * @return {number}
 */
var uniqueMorseRepresentations = function(words) {
  let morseLetters = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."];
  let hashSet = new Set;
  for (let i = 0; i < words.length; i++) {
      for (let j = 0; j < 26; j++) {
          let charCode = String.fromCharCode(97 + j);
          while (words[i].includes(charCode)) {
              words[i] = words[i].replace((charCode), morseLetters[j]);
          }
      }
  }
  
  for (let i = 0; i < words.length; i++) {
      hashSet.add(words[i]);
  }
  return hashSet.size;
};