package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Phonebook {
    Map<String, ArrayList<String>> Book = new TreeMap<String, ArrayList<String>>();
    public void add(String name,String telephoneNumber){
        if  (Book.containsKey(name) == false){
            Book.put(name, new ArrayList<String>());
        }
        Book.get(name).add(telephoneNumber);
    }
    public ArrayList<String>get(String name){
        if  (Book.containsKey(name) == false){
           return null;
        }
        return Book.get(name);
    }
}
