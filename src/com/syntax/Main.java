package com.syntax;

public class Main {

    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        solarSystem.sun = 1;
        solarSystem.moon = 1;
        solarSystem.planets = 3;

        Sun sun = new Sun();
        sun.radius = "696,340 km";
        sun.temperature = "5,505°C";
        sun.color = "red";
    }
}
