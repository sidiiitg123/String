package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ValidIp {


    public ArrayList<String> restoreIpAddresses(String A) {

        if (A.length() < 3 || A.length() > 12) {
            return new ArrayList<>();
        }

        return convert(A);
    }

    public ArrayList<String> convert(String A) {

            ArrayList<String> myarr=new ArrayList<>();
            int size=A.length();
            String snew=A;

            for(int i=1;i<size-2;i++){
                for(int j=i+1;j<size-1;j++){
                    for(int k=j+1;k<size;k++){
                        snew=snew.substring(0,k)+"."+snew.substring(k);
                        snew=snew.substring(0,j)+"."+snew.substring(j);
                        snew=snew.substring(0,i)+"."+snew.substring(i);
                        if(isValid(snew)){
                            myarr.add(snew);
                        }
                        snew=A;
                    }
                }
            }

        Collections.sort(myarr, new Comparator<String>()
        {
            public int compare(String o1, String o2)
            {
                String a1[] = o1.split("[.]");
                String a2[] = o2.split("[.]");

                int result = -1;
                for (int i = 0; i < 4 &&
                        result != 0; i++)
                {
                    result = a1[i].compareTo(a2[i]);
                }
                return result;
            }
        });

        return myarr;
    }

    public boolean isValid(String s){
       String[] arr= s.split("[.]");

       int len=s.length();

       for(int i=0;i<len;i++){
           int myint=Integer.parseInt(arr[i]);
           if(arr[i].length()>1 && myint==0){
               return false;
           }
           if(arr[i].length()>1 && arr[i].charAt(0)=='0'){
               return false;
           }
           if(myint<0 || myint>255 || arr[i].length()>3){
               return false;
           }
       }
       return true;
    }


}
