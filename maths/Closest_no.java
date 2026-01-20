https://www.geeksforgeeks.org/problems/closest-number5728/1

class Solution {
    static int closestNumber(int n, int m) {
        int q = n / m;

        int n1 = m * q;
        int n2 = m * (q + 1);
        int n3 = m * (q - 1); 

        int d1 = Math.abs(n1 - n);
        int d2 = Math.abs(n2 - n);
        int d3 = Math.abs(n3 - n);

        int res = n1;
        int minDist = d1;

        if (d2 < minDist || (d2 == minDist && Math.abs(n2) > Math.abs(res))) {
            res = n2;
            minDist = d2;
        }

        if (d3 < minDist || (d3 == minDist && Math.abs(n3) > Math.abs(res))) {
            res = n3;
        }

        return res;
    }
}
