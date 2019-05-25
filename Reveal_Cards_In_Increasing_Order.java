class Solution {
  public int[] deckRevealedIncreasing(int[] deck) {
      int[] sortedDeck = new int[deck.length];
      LinkedList<Integer> list = new LinkedList<>();
      Arrays.sort(deck);
      list.add(deck[deck.length - 1]);
      for(int i = deck.length - 2; i >= 0; i--) {
          int removed = list.removeLast();
          list.addFirst(removed);
          list.addFirst(deck[i]);
      }
      for(int i = 0; i < sortedDeck.length; i++) {
          sortedDeck[i]=list.remove();
      }
      return sortedDeck;
  }
}