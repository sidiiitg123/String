package com.company;

public class LongestPalindromeSubstring {

    private int start, end, maxLength;

    private int checkPalindrome(String A, int left, int right) {
        while (left >= 0 && right < A.length() && A.charAt(left) == A.charAt(right)) {
            if (right - left + 1 > maxLength) {
                start = left;
                end = right ;
                maxLength = right - left + 1;
            }
            left--;
            right++;
        }
        return maxLength;
    }

    public String longestPalindrome(String A) {
        int start = 0, end = 0, maxLength = 0;
        for (int i = 0; i < A.length(); i++) {
            checkPalindrome(A, i, i); // odd length, center in i
            checkPalindrome(A, i, i + 1); // even length, center between i and i + 1
        }
        return A.substring(start, end+1);
    }
}
