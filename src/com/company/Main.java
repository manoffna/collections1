package com.company;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> phone = new ArrayList<>();
        HashMap<String, String> book = new HashMap<>();

        add(book, "Коля", "9169933342");
        add(book, "Петя", "9152487331");
        add(book, "Вася", "9152521320");
        add(book, "Петя", "9265534221");

        get(book, "Петя");

        System.out.println(book);
    }

    public static void add(HashMap b, String name, String phone) {
        int i = 1;
        if (!b.containsKey(name)) {
            b.put(name, phone);
        } else {
            b.put(name + " тел." + i, phone);
        }
        i = i++;
    }

    public static void get(HashMap b, String name) {
        for (Object tmp : b.keySet()) {
            if (tmp.toString().startsWith(name)) {
            System.out.println(b.get(tmp));}
        }
    }
}
