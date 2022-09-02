package Medium.ReverseInteger;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverse(153423646));
    }

    public static int reverse(int x) {
        int rev = 0;
        if(x > 0) {
            while (x > 0) {
                if(rev > Integer.MAX_VALUE/10) {
                    return 0;
                }
                rev = rev * 10 + x % 10;
                x /= 10;
            }
            return rev;
        } else if(x < 0) {
            x = x*(-1);
            while (x > 0) {
                if(rev > Integer.MAX_VALUE/10) {
                    return 0;
                }
                rev = rev * 10 + x % 10;
                x /= 10;
            }
            return rev*(-1);
        }
        return 0;
    }
}
