package com.leetcode.question;

import java.util.Comparator;
import java.util.List;

public class T7 {

    public static void main(String[] args) {
//        int result = reverse(-2147483648);
//        System.out.println(result);
        List<Integer> a = List.of(1,4,6,3,2);
        a.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
    }

    public static int reverse(int x) {
        int unsign=0;
        boolean negative = false;
        if(x == 0) {
            return x;
        } else if(x>0) {
            unsign = x;
        } else {
            negative = true;
            unsign = Math.abs(x);
        }
        int max = Integer.MAX_VALUE;
        String before = String.valueOf(unsign);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=before.length()-1; i>=0; i--) {
            stringBuilder.append(before.charAt(i));
        }
        String after = stringBuilder.toString();
        Long afterValue = Long.parseLong(after);
        if(afterValue>max) {
            return 0;
        } else {
            if(negative) {
                return Integer.parseInt("-"+after);
            } else {
                return afterValue.intValue();
            }

        }

    }


}
