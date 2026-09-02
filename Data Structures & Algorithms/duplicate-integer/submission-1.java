class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> dups = new ArrayList<>();
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