public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        
        StringBuilder sb = new StringBuilder(str);
        
        int left = 0;
        int right = sb.length() - 1;
        
        while(left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            
            left++;
            right--;
        }
        
        System.out.println(sb.toString());
    }
}
