package illia.nebrat.homework.convertersMain;

import illia.nebrat.homework.converters.CelsiusToFahrenheit;
import illia.nebrat.homework.converters.CelsiusToKelvin;

public class ConvertorMain {
    public static void main(String[] args) {
        CelsiusToFahrenheit celsiusToFahrenheit = new CelsiusToFahrenheit();
        CelsiusToKelvin celsiusToKelvin = new CelsiusToKelvin();

        double celsius = 20;

        System.out.println(celsius + "°C = " + celsiusToFahrenheit.convertFromCelsius(celsius) + "°F");
        System.out.println(celsius + "°C = " + celsiusToKelvin.convertFromCelsius(celsius) + "K");
        System.out.println("70°F = " + celsiusToFahrenheit.convertToCelsius(70) + "°C");
        System.out.println("349K = " + celsiusToKelvin.convertToCelsius(349) + "°C");
    }
}