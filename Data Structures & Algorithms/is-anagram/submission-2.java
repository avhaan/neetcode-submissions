class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String, Integer> a = new HashMap<>();
        HashMap<String, Integer> b = new HashMap<>();

        for (String i: s.split("")) {
            if (a.containsKey(i)) {
                a.replace(i, a.get(i) + 1);
            } else {
                a.put(i,1);
            }
        }
        for (String i: t.split("")) {
            if (b.containsKey(i)) {
                b.replace(i, b.get(i)  + 1 );
            } else {
                b.put(i,1);
            }
        }
        if (a.equals(b)) {
            return true;
        } else {
            return false;
        }

        

    }
}
