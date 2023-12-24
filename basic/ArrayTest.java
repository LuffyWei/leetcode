package com.leetcode.basic;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.Arrays;

public class ArrayTest {

    @Test
    public void testArray() {
        Integer[] array = {123,1,23,1,222,13,44};
        Arrays.sort(array);

        System.out.println(JSON.toJSONString(array));
    }
}
