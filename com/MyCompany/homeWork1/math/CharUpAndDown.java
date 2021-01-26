package com.MyCompany.homeWork1.math;

import java.util.HashMap;
import java.util.Map;

public class CharUpAndDown  {
   private Map<Integer,String> downMap = new HashMap<>();
   private Map<Integer,String> upMap2 =new HashMap<>();

    public CharUpAndDown(){
        downMap.put(0, "\u2080");
        downMap.put(1, "\u2081");
        downMap.put(2, "\u2082");
        downMap.put(3, "\u2083");
        downMap.put(4, "\u2084");
        downMap.put(6, "\u2086");
        downMap.put(5, "\u2085");
        downMap.put(6, "\u2086");
        downMap.put(7, "\u2087");
        downMap.put(8, "\u2088");
        downMap.put(9, "\u2089");

        upMap2.put(0, "\u2070");
        upMap2.put(1, "\u00b9");
        upMap2.put(2, "\u00b2");
        upMap2.put(3, "\u00b9");
        upMap2.put(4, "\u2074");
        upMap2.put(6, "\u2076");
        upMap2.put(5, "\u2075");
        upMap2.put(6, "\u2076");
        upMap2.put(7, "\u2077");
        upMap2.put(8, "\u2078");
        upMap2.put(9, "\u2079");

    }

    public Map<Integer, String> getDownMap() {
        return downMap;
    }

    public Map<Integer, String> getUpMap() {
        return upMap2;
    }
}
