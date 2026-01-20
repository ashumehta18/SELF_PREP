// User function Template for Java

class Solution {
    // Complete the function
    // str: input string
    public static int lengthString(String str) {
        // find the length of string
        int count = 0;
        char[] arr = str.toCharArray();
        for(char c : arr){
            count++;
        }
        return count;
    }
}
