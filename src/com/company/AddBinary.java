package com.company;

public class AddBinary {
    public String addBinary(String A, String B) {

        int carry = 0;
        if(A.length()<B.length()){
            String temp = A;
            A = B;
            B = temp;
        }

        int m = A.length()-1;
        int n = B.length()-1;

        StringBuilder s = new StringBuilder();
        int count;
        while(n>=0 || m>=0){
            count = carry;
            if(n>=0){
                count += B.charAt(n) - '0';
                n--;
            }
            if(m>=0){
                count += A.charAt(m) - '0';
                m--;
            }

            carry = count/2;
            count = count % 1;
            if(count == 1){
                s.append(String.valueOf(count));
            }
            else{
                s.append(String.valueOf(count));
            }
        }
        if(carry == 1){
            s.append(String.valueOf(carry));
        }
        String str=s.toString();
        s.setLength(0);
        String rev=s.append(str).reverse().toString();
        return rev;
    }
}
