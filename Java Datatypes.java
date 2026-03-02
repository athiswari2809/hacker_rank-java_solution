import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                
                // Check Byte: 8-bit signed
                if (x >= -128 && x <= 127) System.out.println("* byte");
                
                // Check Short: 16-bit signed
                if (x >= -32768 && x <= 32767) System.out.println("* short");
                
                // Check Int: 32-bit signed
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");
                
                // Check Long: 64-bit signed
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");
                
            } catch (Exception e) {
                // Use sc.next() to capture the input that caused the overflow
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
    
