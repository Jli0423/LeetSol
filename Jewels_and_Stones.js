/**
 * @param {string} J
 * @param {string} S
 * @return {number}
 */
var numJewelsInStones = function(J, S) {    
  let searchOne = 0;
  let searchTwo = 0;
  for(let i = 0; i < J.length; i++) {
      S.search(J[i]) !== -1 && searchOne++;
  }

  for(let i = 0; i < S.length; i++) {
      J.search(S[i]) !== -1 && searchTwo++;
  }

  return searchOne > searchTwo ? searchOne : searchTwo;
};

// Better solutions...
/**
 * @param {string} J
 * @param {string} S
 * @return {number}
 */
var numJewelsInStones = function(J, S) {
    let x = 0;
    for(let i = 0; i < S.length; i++) {
        if (J.includes(S.charAt(i))) {
            x++;
        }
    }
    return x;
};