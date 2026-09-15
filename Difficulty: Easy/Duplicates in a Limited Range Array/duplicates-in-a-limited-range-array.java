class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        Set <Integer> set = new HashSet <> ();
        ArrayList <Integer> list = new ArrayList<> ();
        for (int i : arr){
            if (set.contains(i)) list.add(i);
            else set.add(i);
        }
        return list;
    }
}