package com.company;

public class AmazingSubarray {

    public boolean isVowel(char c){
        String s="aeiouAEIOU";
        char[] myArr=s.toCharArray();
        for(int i=0;i<myArr.length;i++){
            if(myArr[i]==c){
                return true;
            }
        }
        return false;
    }

    public int solve(String A){

        if(A.length()==1){
            return 1;
        }
        if(A.length()==0){
            return 0;
        }

        int value=0;

        for(int i=0;i<A.length();i++){
            if(isVowel(A.charAt(i))){
                value+=(A.length()-i)%10003;
            }
        }

        return value%10003;

    }
}
