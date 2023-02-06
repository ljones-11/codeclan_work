package org.example;

    public class Main {
        public static void main(String[] args) {

            Planet planet = new Planet("Mars", 908973);
            System.out.println(planet.getName() + " is " + planet.getSize());
            String explode = planet.explode();

            System.out.println(explode);
        }
    }