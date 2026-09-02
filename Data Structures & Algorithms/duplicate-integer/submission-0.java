class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> dups = new ArrayList<>();
        for (int i: nums) {
            if (!dups.contains(i)) {
                dups.add(i);
            } else {
                return true;
            }

        }
        return false;
    }
}