/**
 * @param {string[]} A
 * @return {number}
 */
var minDeletionSize = function(A) {
  let count = 0;
  for(let i = 0; i < A[0].length; i++) {
      let tempArray = [];
      let originalArray = [];
      A.forEach((string) => {
          tempArray.push(string[i].charCodeAt());
      });
      originalArray = new Array(...tempArray);
      tempArray.sort((a, b) => a - b);
      if (JSON.stringify(originalArray) !== JSON.stringify(tempArray)) {
          count++;
      }
  }
  return count;
};