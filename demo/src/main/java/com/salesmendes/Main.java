package com.salesmendes;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Paco", "Pepe", 25, "paco@pepe.com");

        Gson gson = new Gson();
        String json = gson.toJson(p);
        System.out.println(json);
    }
}