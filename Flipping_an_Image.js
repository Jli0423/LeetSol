/**
 * @param {number[][]} A
 * @return {number[][]}
 */

var flipAndInvertImage = function(A) {
  A.forEach((arr) => {
      arr = arr.reverse();
      for(let i = 0; i < arr.length; i++) {
          if (arr[i] === 0) {
              arr[i] = 1;
          } else {
              arr[i] = 0;
          }
      };
      // arr = Array.from(arr, el => el == 1 ? 0 : 1);
      // why does this not work tf
  });
  return A;
};