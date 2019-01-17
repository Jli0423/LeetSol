/**
 * @param {number[]} A
 * @return {number}
 */
var peakIndexInMountainArray = function(A) {
  let duplicate = A.slice(0);
  let high = duplicate.sort((a, b) => b - a)[0];
  return A.indexOf(high);
};