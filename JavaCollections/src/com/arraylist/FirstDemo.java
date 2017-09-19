package com.arraylist;

import java.util.ArrayList;

/**
 * Created by PriyabratP on 27-07-2017.
 */
public class FirstDemo {

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Priyabrat");
        list.add("Satyabrat");
        list.add("Subrat");
        System.out.println(list);
        System.out.println(list.contains("Subrat"));
    }
}
