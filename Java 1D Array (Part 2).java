import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int i) {
        // 1. Base Case: If we move past the end of the array, we win!
        if (i >= game.length) {
            return true;
        }
        
        // 2. Base Case: If we hit a wall (1) or go out of bounds behind index 0
        if (i < 0 || game[i] == 1) {
            return false;
        }

        // 3. Mark the current cell as visited to prevent infinite recursion
        game[i] = 1;

        // 4. Explore all possible moves using OR logic:
        // Try jumping forward, walking forward, then walking backward
        return isSolvable(leap, game, i + leap) || 
               isSolvable(leap, game, i + 1)    || 
               isSolvable(leap, game, i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println(canWin(leap, game) ? "YES" : "NO");
        }
        scan.close();
    }
}
