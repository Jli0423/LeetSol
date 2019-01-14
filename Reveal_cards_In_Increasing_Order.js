/**
 * @param {number[]} deck
 * @return {number[]}
 */

var deckRevealedIncreasing = function(deck) {
  deck.sort((a, b) => b - a);
  let sortedResults = [deck[0]];
  let tempHolder;
  // 1. push to front of array
  // 2. make back of array to the front
  
  for (let i = 1; i < deck.length; i++) {
      sortedResults.unshift(deck[i]);
      if (i === deck.length - 1) {
          break;
      }
      tempHolder = sortedResults.pop();
      sortedResults.unshift(tempHolder);
  }
  
  return sortedResults;
};