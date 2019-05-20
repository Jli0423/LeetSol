/**
 * @param {string} S
 * @return {number}
 */
var minAddToMakeValid = function(S) {
  let answer = 0;
  let count = 0;
  let stack = [];
  for(let i = 0; i < S.length; i++) {
      stack.push(S[i]);
  }
  for(let i = 0; i < S.length; i++) {
      let i = stack.pop();
      if (i === '(' && count <= 0) {
          answer++;
      } else {
          i === ')' ? count++ : count--;
      }
  }
  return answer + count;
};