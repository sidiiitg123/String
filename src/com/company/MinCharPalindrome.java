package com.company;

import java.util.ArrayList;

public class MinCharPalindrome {


    public int solve(String A) {

        int j = A.length() - 1;
        int i = 0;
        int count=0;
        while(i<=j) {
                if (Character.valueOf(A.charAt(i)).equals(Character.valueOf(A.charAt(j)))) {
                    i++;
                    j--;
                } else {
                    count++;
                   j=A.length()-count-1;
                   i=0;
                }
        }
        return count;
    }
}
