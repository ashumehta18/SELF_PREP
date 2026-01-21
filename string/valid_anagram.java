https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1,a2);


    }
}


// strings are same or not ?
https://www.geeksforgeeks.org/problems/check-if-two-strings-are-same-or-not--155406/1
// User function Template for Java
class StringUtils {
    // Function to check if two strings are the same
    public static boolean areStringsSame(String s1, String s2) {
        // code here
        // if(s1.length() == null || s2.length() == null){
        //     return false;
        // }
        // if(s1.length() == null && s2.length() == null){
        //     return false;
        //}
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0 ; i<s1.length() ;i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
