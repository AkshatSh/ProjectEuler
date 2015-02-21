import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cases = console.nextInt();
        for (int c = 0; c < cases; c++) {
            int layers = console.nextInt();
            int[] tree = new int[layers * (layers + 1) / 2];
            int treeCount = 0;
            for (int i = 1; i <= layers; i++){ 
                for (int j = 1; j <= i; j++){
                    tree[treeCount] = console.nextInt();
                    treeCount++;
                }   
            }
            treeCount = 1;
            for (int i = 2; i <= layers; i++) {
                int parentStart = (i - 2) * (i-1) / 2;
                int parentEnd = (i - 1) * (i) / 2;
                for (int j = 1; j<= i; j++) {
                    int p;
                    if (j == 1) {
                        p = tree[parentStart];
                    } else if (j == i) {
                        p = tree[parentEnd - 1];
                    } else {
                        p = Math.max(tree[parentStart + j - 2], tree[parentStart + j - 1]);
                    }
                    tree[treeCount] += p;
                    treeCount++;
                }
            }
            int max = tree[0];
            for (int i = (layers - 1) * (layers) / 2; i < (layers) * (layers + 1) / 2; i++) {
                if (tree[i] > max) {
                    max = tree[i];
                }
            }
            System.out.println(max);
        }
    } 
}