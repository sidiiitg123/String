package com.company;

import java.util.HashMap;
import java.util.Map;

public class ZigZag {

    public String convert(String A,int B){
        Map<Integer,StringBuilder> mymap=new HashMap<>();
        int pos=0;
        boolean incr=true;
        for(char c:A.toCharArray()){

            if(pos==B){
                incr=false;
            }
            if(pos==1){
                incr=true;
            }
            if(incr){
                pos++;
            }else{
                pos--;
            }

            if(!mymap.containsKey(pos)){
                mymap.put(pos,new StringBuilder());
            }
            mymap.get(pos).append(c);

        }

        StringBuilder sb= new StringBuilder();
        for(int i:mymap.keySet()){
            sb.append(mymap.get(i));
        }
        return sb.toString();
    }

}
