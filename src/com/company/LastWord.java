package com.company;

public class LastWord {

    //    public int lengthOfLastWord(final String A) {
//
//        boolean space=false;
//        int count=0;
//
//        for(int i=0;i<A.length();i++){
//            if(A.charAt(i)==' '){
//                space=true;
//            }
//        }
//
//        if(space){
//            int k=A.length()-1;
//            int j=A.length()-1;
//            while(j>=0){
//                if(A.charAt(j)==' '){
//                    count++;
//                    j--;
//                }
//            }
//            while(j>=0){
//                if(Character.isLetter(A.charAt(j))){
//                    j--;
//                }else{
//                    return k-j-count;
//                }
//
//            }
//        }
//        return A.length();
//    }
    int jumpReverseSpaces(String A) {
        int pos = A.length() - 1;
        while (pos >= 0 && A.charAt(pos) == ' ') {
            pos--;
        }

        return pos;
    }


    public int lengthOfLastWord(final String A) {

        int pos = jumpReverseSpaces(A);

        int count = 0;
        while (pos >= 0 && A.charAt(pos) != ' ') {
            count++;
            pos--;
        }

        return count;
    }
}
