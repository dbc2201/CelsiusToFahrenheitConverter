package io.github.dbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TemperatureConverterTest {

	private TemperatureConverter temperatureConverter;

	@BeforeEach
	void setUp() {
		temperatureConverter = new TemperatureConverter();
	}

	@ParameterizedTest(name = "convertCelsiusToFahrenheit({arguments})")
	@CsvSource(value = {"31.0, 87.8", "20.0, 68.0", "37.0,98.6", "37.4,99.32", "19.6,67.28"})
	void convertCelsiusToFahrenheit(double temperature, double expectedValue) {
		double convertedTemperature = temperatureConverter.convertCelsiusToFahrenheit(temperature);
		Assertions.assertEquals(
				expectedValue,
				convertedTemperature,
				0.1,
				"The converted temperature is not correct!"
		);
	}

	@ParameterizedTest(name = "convertFahrenheitToCelsius({arguments})")
	@CsvSource(value = {"97.4, 36.3333333", "32.0,0.0", "68.0,20.0", "-10.0,-23.3333333", "-20.0,-28.8888889"})
	void convertFahrenheitToCelsius(double temperature, double expectedValue) {
		double convertedTemperature = temperatureConverter.convertFahrenheitToCelsius(temperature);
		Assertions.assertEquals(
				expectedValue,
				convertedTemperature,
				0.1,
				"The converted temperature is not correct!"
		);
	}
}
