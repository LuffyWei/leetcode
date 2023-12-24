package com.leetcode.question;

public class T6 {

    public static void main(String[] args) {
        String s = "1234567890";
        int size = 3;
        int num = s.length()/size+1;
        for(int i=0; i<num-1; i++) {
            String subStr = s.substring(i*size, (i+1)*size);
            System.out.println(subStr);
        }
        String finalStr = s.substring(size*(num-1));
        System.out.println(finalStr);
    }
}
