package com.niit.jap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TemperatureConverterTest {

    private TemperatureConverter temperatureConverter;

    @BeforeEach
    void setUp() {
        temperatureConverter = new TemperatureConverter();
    }

    @ParameterizedTest(name = "convertCelsiusToFahrenheit({arguments})")
    @ValueSource(doubles = {31.0, 20.0, 37.4, 19.6, 51.9})
    void convertCelsiusToFahrenheit(double temperature) {
        double convertedTemperature = temperatureConverter.convertCelsiusToFahrenheit(temperature);
        Assertions.assertEquals(
                temperature * 1.8 + 32.0,
                convertedTemperature,
                0.1,
                "The converted temperature is not correct!"
        );
    }

    @ParameterizedTest(name = "convertFahrenheitToCelsius({arguments})")
    @ValueSource(doubles = {97.4, 32.0, 68.0, -10.0, -20.0})
    void convertFahrenheitToCelsius(double temperature) {
        double convertedTemperature = temperatureConverter.convertFahrenheitToCelsius(temperature);
        Assertions.assertEquals(
                temperature - 32.0 / 1.8,
                convertedTemperature,
                0.1,
                "The converted temperature is not correct!"
        );
    }
}