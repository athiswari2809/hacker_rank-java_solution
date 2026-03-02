import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Read the input N
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        // 1. Fixed the loop syntax: added 'int', semicolons, and adjusted range to 1-10
        for (int i = 1; i <= 10; i++) {
            // 2. Calculate result
            int r = N * i;
            
            // 3. Print in the specific format required
            System.out.println(N + " x " + i + " = " + r);
        }

        bufferedReader.close();
    }
}
