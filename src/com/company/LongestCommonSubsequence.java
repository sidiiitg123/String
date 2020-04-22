package com.company;

import java.util.ArrayList;

public class LongestCommonSubsequence {
    public class LongestCommonPrefix {

        int common(String A, String B, int min) {

            int pos = -1;
            for (int i = 0; i <= min; i++) {
                if (A.charAt(i) == B.charAt(i)) {
                    pos = i;
                } else {
                    return pos;
                }
            }

            return pos;
        }

        public String longestCommonPrefix(ArrayList<String> A) {

            if (A.size() == 0) {
                return "";
            }
            if (A.size() == 1) {
                return A.get(0);
            }

            int pos = Integer.MAX_VALUE;
            int min;
            for (int i = 1; i < A.size(); i++) {

                min = Math.min(Math.min(A.get(i - 1).length(), A.get(i).length()) - 1, pos);
                pos = common(A.get(i - 1), A.get(i), min);
                if (pos == -1) {
                    return "";
                }
                min = pos;
            }

            return A.get(0).substring(0, pos + 1);
        }

//    public String minLengthStringInArray(ArrayList<String> A){
//        int min=Integer.MAX_VALUE;
//        String minString="";
//        for(String s:A){
//            if(s.length()<min){
//                min=s.length();
//                minString=s;
//            }
//        }
//        return minString;
//    }
//
//    public boolean allContainPrefix(ArrayList<String> A,int low,int mid,String minString){
//
//        for(int i=0;i<A.size();i++){
//            for(int j=0;j<=mid;j++){
//                if(A.get(i).charAt(j)!=minString.charAt(j))
//                    return false;
//            }
//        }
//        return true;
//    }
//
//
//    public String longestCommonPrefix(ArrayList<String> A) {
//
//        String minString = minLengthStringInArray(A);
//        int length = minString.length();
//
//        int low = 0;
//        int high = length;
//        String prefix = "";
//
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//
//            if (allContainPrefix(A, low, mid, minString)) {
//                prefix+=minString.substring(low,mid-low+1);
//
//                low=mid+1;
//            }else{
//                high=mid-1;
//            }
//        }
//        return prefix;
//    }
    }
}
