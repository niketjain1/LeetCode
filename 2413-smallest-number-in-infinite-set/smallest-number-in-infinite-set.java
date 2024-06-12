class SmallestInfiniteSet {
    int current;
    Set<Integer> set;
    public SmallestInfiniteSet() {
        current = 1;
        set = new HashSet<Integer>();
    }
    
    public int popSmallest() {
        if (!set.isEmpty()) {
            int minNumber = Collections.min(set);
            set.remove(minNumber);
            return minNumber;
        }
        current++;
        return current - 1;
    }
    
    public void addBack(int num) {
       if (current > num) {
        set.add(num);
       }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */