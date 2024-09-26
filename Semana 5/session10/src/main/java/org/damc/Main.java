package org.damc;

import org.damc.models.Car;
import org.damc.models.Person;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> dictionary = new HashMap<Integer, String>();

        dictionary.put(1, "Diego");
        dictionary.put(2, "Kendrick");
        dictionary.put(3, "Ronaldo");
        dictionary.put(4, "Rodrigo");
        dictionary.put(5, "Regina");

        System.out.println(dictionary.get(5));

        Map<String, String> dictionary2 = new HashMap<String, String>();
        dictionary2.put("Diego", "Martinez");

        Map<String, Object> list = new HashMap<String, Object>();
        list.put("Diego", new Person("Diego", "Martinez"));
        list.put("Hilux", new Car("Toyota", "Hilux", 2024));

    }
}