package Clases.src;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
    public static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> colorCounts = new HashMap<>();
        for (int color : ar) {
            colorCounts.put(color, colorCounts.getOrDefault(color, 0) + 1);
        }
        int totalPairs = 0;
        for (int count : colorCounts.values()) {
            totalPairs += count / 2;
        }
        return totalPairs;
    }

    public static void main(String[] args) {
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(n, ar)); // Output: 3
    }
}