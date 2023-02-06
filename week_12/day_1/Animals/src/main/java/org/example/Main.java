package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bear bear1 = new Bear("Balu");
        String name = bear1.getName();
        System.out.println(name);

        bear1.setName("Baloo");
        System.out.println(bear1.getName());

        System.out.println(bear1.name);
        bear1.name = "Maggie";
    }
}