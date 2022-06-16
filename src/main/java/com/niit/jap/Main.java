package com.niit.jap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the reading of temperature in Fahrenheit: ");
        double temperatureInFahrenheit = scanner.nextDouble();
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double toCelsius = temperatureConverter.convertFahrenheitToCelsius(temperatureInFahrenheit);
        System.out.println(temperatureInFahrenheit + "°F = " + toCelsius + "°C");
        System.out.println("Please enter the reading of temperature in Celsius: ");
        double temperatureInCelsius = scanner.nextDouble();
        double toFahrenheit = temperatureConverter.convertCelsiusToFahrenheit(temperatureInCelsius);
        System.out.println(temperatureInCelsius + "°C = " + toFahrenheit + "°F");
        scanner.close();
    }
}