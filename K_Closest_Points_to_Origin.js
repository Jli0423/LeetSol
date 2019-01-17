/**
 * @param {number[][]} points
 * @param {number} K
 * @return {number[][]}
 */
sortFunc = (a, b) => {
  return Math.sqrt(a[0]**2 + a[1]**2) - Math.sqrt(b[0]**2 + b[1]**2);
}

var kClosest = function(points, K) {
  points.sort(sortFunc);
  return points.splice(0, K);
};