import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cases = console.nextInt();
        for (int i = 0; i  < cases; i++) {
            System.out.println(addEvens(console.nextLong()));
        }
    }
    
    public static long addEvens(long num) {
        long evenSum = 0;
        long x = 0;
        long y = 1;
        while (y < num && x < num) {
            x += y;
            if (x % 2 == 0 && x < num)
                evenSum += x;
            y += x;
            if (y % 2 == 0 && y < num)
                evenSum += y;
        }
        return evenSum;
    }
}