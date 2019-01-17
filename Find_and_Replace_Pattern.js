/**
 * @param {string[]} words
 * @param {string} pattern
 * @return {string[]}
 */
var findAndReplacePattern = function(words, pattern) {
  let originPattern = {};
  let soln = [];
  
  Array.from(pattern).forEach((letter, index) => {
      !!originPattern[letter] ? originPattern[letter].push(index) : originPattern[letter] = [index];
  });
  
  words.forEach((word) => {
      let pattern = {};
      let match = false;
      
      Array.from(word).forEach((letter, index) => {
         !! pattern[letter] ? pattern[letter].push(index) : pattern[letter] = [index]; 
      });
      
      match = Object.keys(originPattern).every(k1 => Object.keys(pattern).some(k2 => 
              JSON.stringify(originPattern[k1]) == JSON.stringify(pattern[k2])));

      match && soln.push(word);
  });
  return soln;
};