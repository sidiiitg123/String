package com.company;

public class StrStr {

    public int strStr(final String A ,final String B){

        String needle="",haystack="";
        if(A.length()>B.length()){
             needle=B;
             haystack=A;
        }else{
            needle=A;
            haystack=B;
        }
        if(needle=="" || needle.length()==0){
            return -1;
        }
        if(haystack=="" || haystack.length()==0){
            return -1;
        }

        int n=needle.length();
        int h=haystack.length();

        for(int i=0;i<h;i++){
            int j;
            for(j=0;j<n;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            }
            if(j==n){
                return 1;
            }
        }
        return  -1;
    }
}
