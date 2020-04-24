package com.company;

import java.util.Collections;
import java.util.List;

public class kTHsmallest {


    public int kthsmallest(final List<Integer> A, int B) {
        if(A == null || A.size() == 0)
            return -1;

        if(A.size()<B){
            return -1;
        }
        int lo = Collections.min(A);
        int hi = Collections.max(A);

        while(lo <= hi) {
            int mid = lo + (hi - lo)/2;
            int countLess = 0, countEqual = 0;

            for(int i = 0; i < A.size(); i++) {
                if(A.get(i) < mid) {
                    countLess++;
                }else if(A.get(i) == mid) {
                    countEqual++;
                }
                if(countLess >= B) break;
            }

            if(countLess < B && countLess + countEqual >= B){
                return mid;
            }else if(countLess >= B) {
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }

        return -1;
    }
}
