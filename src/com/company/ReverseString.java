package com.company;

import java.util.ArrayList;

public class ReverseString {

    public String solve(String a) {

        if (a == null || a.length() == 0) {
            return "";
        }

        String[] arr = a.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; --i) {
            if (!arr[i].equals(" ")) {
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }
}
