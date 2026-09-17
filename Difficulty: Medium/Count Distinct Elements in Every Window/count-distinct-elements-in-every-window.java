class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        HashMap <Integer,Integer> set = new HashMap <> ();
        int left=0;
        ArrayList<Integer> list = new ArrayList<> ();
        for (int i=0; i<k; i++){
            set.put(arr[i],set.getOrDefault(arr[i],0)+1);
        }
        list.add(set.size());
        for (int i=k; i<arr.length; i++){
            set.put(arr[left], set.get(arr[left]) - 1);
            if (set.get(arr[left]) == 0) set.remove(arr[left]);
            left++;
            set.put(arr[i], set.getOrDefault(arr[i], 0) + 1);
            list.add(set.size());
        }
        return list;
    }
}