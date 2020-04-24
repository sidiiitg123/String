package com.company;

import java.util.ArrayList;

public class NumRange {
    public int numRange(ArrayList<Integer> A, int B, int C) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int count = 0;

        while(i < A.size()){
            sum = sum + A.get(j);
            if((sum >= B) && (sum <= C)){
                count++;
                j++;
            }
            else if(sum < B){
                j++;
            }
            else if(sum > C){
                i++;
                j = i;
                sum = 0;
            }
            if(j == A.size()){
                sum = 0;
                i++;
                j = i;
            }
        }

        return count;
    }
}
