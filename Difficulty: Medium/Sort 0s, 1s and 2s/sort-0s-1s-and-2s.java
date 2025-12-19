class Solution {
    public void sort012(int[] arr) {
        // code here
        int zero = 0, one = 0, two = 0;

      
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0: zero++; break;
                case 1: one++; break;
                case 2: two++; break;
            }
        }

        int index = 0;
        while (zero-- > 0) arr[index++] = 0;
        while (one-- > 0) arr[index++] = 1;
        while (two-- > 0) arr[index++] = 2;
    }
}