/**
 * @param {number[]} A
 * @return {number[]}
 */
var sortArrayByParity = function(A) {
  let soln = [];
  A.forEach(number => {
      !!(number % 2) ? soln.push(number) : soln.unshift(number);
  });
  return soln;
};