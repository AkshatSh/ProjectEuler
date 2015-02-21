import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cases = console.nextInt();
        for (int i = 0; i < cases; i++) {
            System.out.println(numberofM(console.nextLong()));
        }
    }
    
    public static long numberofM(long limit) { 
        limit--;
        return getSum(3, limit) + getSum(5, limit) - getSum(15, limit);
    }
    
    public static long getSum(long multiple, long limit) {
       long n = limit / multiple;
       return multiple * (n) * (n + 1) / 2;
    }
}