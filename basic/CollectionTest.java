package com.leetcode.basic;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CollectionTest {


    @Test
    public void testList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(23);
        list.add(113);
        System.out.println(JSON.toJSONString(list));

        list.removeFirst();
        System.out.println(JSON.toJSONString(list));

        list.removeLast();
        System.out.println(JSON.toJSONString(list));

        Set<Integer> set = new HashSet<>();
        set.add(111);
        list.addAll(set);
        System.out.println(JSON.toJSONString(list));

        list.remove(list.size()-1);
        System.out.println(JSON.toJSONString(list));

        //list转array
        Integer[] array = list.toArray(Integer[]::new);
        System.out.println(JSON.toJSONString(array));
    }


}
