https://www.geeksforgeeks.org/problems/swap-two-numbers3844/1
class Solution {
    static List<Integer> get(int a, int b) {
        // code here
        List<Integer> list = new ArrayList<>();
        a = a^b;
        b = b^a;
        a= a^b;
        list.add(a);
        list.add(b);
        return list;
    }
}
