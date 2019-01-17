/**
 * @param {string} S
 * @return {number[]}
 */
var diStringMatch = function(S) {
  let increase = 0;
  let decrease = S.length;
  let inserted = 0;
  let ans = [];
  
  while (inserted < S.length) {
      if (S[inserted] === 'I') {
          ans.push(increase);
          increase++;
      } else {
          ans.push(decrease);
          decrease--;
      }
      inserted++;
  }
  S.pop === 'I' ? ans.push(increase) : ans.push(decrease);
  return ans;
};