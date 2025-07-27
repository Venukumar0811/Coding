class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
         ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        int n = a.length, m = b.length;

        while (i < n && j < m) {
            while (i > 0 && i < n && a[i] == a[i - 1]) i++;
            while (j > 0 && j < m && b[j] == b[j - 1]) j++;

            if (i >= n || j >= m) break;

            if (a[i] < b[j]) {
                union.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                union.add(b[j]);
                j++;
            } else { 
                union.add(a[i]);
                i++;
                j++;
            }
        }

        while (i < n) {
            while (i > 0 && i < n && a[i] == a[i - 1]) i++;
            if (i < n) {
                union.add(a[i]);
                i++;
            }
        }

        while (j < m) {
            while (j > 0 && j < m && b[j] == b[j - 1]) j++;
            if (j < m) {
                union.add(b[j]);
                j++;
            }
        }

        return union;
    }
}
