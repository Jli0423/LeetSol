/*
 * @param {number[]} A
 * @return {number}
 */
var repeatedNTimes = function(A) {
  A.sort();
  if (A[A.length/2] === A[A.length/2 - 1]) {
      console.log(A);
      return A[A.length/2];
  }
  if (A[A.length/2 - 1] === A[0]) {
      return A[0];
  }
  return A[A.length - 1];
};