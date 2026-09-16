class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        int[] ar = new int[arr.length];
        for (int i : arr) ar[i - 1]++;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : ar) list.add(i);
        return list;
    }
}