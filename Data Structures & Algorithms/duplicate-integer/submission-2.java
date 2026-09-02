class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dups = new HashSet<>();
        for (int i: nums) {
            if (dups.contains(i)) {
                return true;
            } else {
                dups.add(i);
            }

        }
        return false;
    }
}