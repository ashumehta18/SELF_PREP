// User function Template for Java
https://www.geeksforgeeks.org/problems/distance-between-2-points3200/1
class Solution {
    public int distance(int x1, int y1, int x2, int y2) {
        // Code here
        int a = (x2-x1) * (x2-x1);
        int b = (y2-y1) * (y2-y1);
        int ans = a+b;
        return (int)Math.round(Math.sqrt(ans));
    }
}
