package com.hashMap.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hashMapDemo {

    public static void main(String[] args) {
//        Map<String,Object> map = new HashMap<>();
//        map.put("dd",333);
//        int x=  Integer.MAX_VALUE;
//        System.out.println(x);


        List<String> list = new ArrayList<>();
        list.add("yu");
        list.add("wang");
        list.add("hua");
        list.add("yu2");
        list.add("wang2");
        list.add("hua2");
        for (String s:list) {
            if("wang2".equals(s)){
                list.remove(s);
            }
            System.out.println("i:"+s);
        }
    }
}
