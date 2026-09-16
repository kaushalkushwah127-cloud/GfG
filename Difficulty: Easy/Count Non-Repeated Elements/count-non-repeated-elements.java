class Solution {
    public int countNonRepeated(int arr[]) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int[] ar = new int[max + 1];

        for (int i : arr)
            ar[i]++;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 1)
                count++;
        }

        return count;
    }
}