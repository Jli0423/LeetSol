class MapSum {
    Map<String, Integer> map;
    /** Initialize your data structure here. */
    public MapSum() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key, val);
    }

    public int sum(String prefix) {
        int s = 0;
        for(Map.Entry<String, Integer> me : map.entrySet()){
            if(me.getKey().startsWith(prefix)){
                s += me.getValue();
            }
        }
        return s;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
