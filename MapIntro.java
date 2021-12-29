package com.company;

import java.util.HashMap;
import java.util.Map;
public class MapIntro {
    public static void main(String[]args){
        Map<Integer,String> n = new HashMap<>();
        n.put(1,"Avinandan Bose");
        n.put(2, "Debasish Ghosh");
        Map<Integer,String> n1 = new HashMap<>();
        n1.put(3,"My Details");
        n1.put(4, "Friend's Details");
        n.putAll(n1);
        System.out.println(n);
        System.out.println(n.entrySet());
        for(Map.Entry<Integer,String> entry : n.entrySet()){
            Integer i = entry.getKey();
            String s = entry.getValue();
            System.out.println("Key:"+i+","+"Value:"+s);

        }

    }

}
