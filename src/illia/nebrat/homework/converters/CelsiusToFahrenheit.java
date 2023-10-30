package illia.nebrat.homework.converters;

public class CelsiusToFahrenheit extends TemperatureConverter {
    public double convertToCelsius(double temperature) {
        return (temperature - 32) * 5 / 9;
    }

    public double convertFromCelsius(double temperature) {
        return temperature * 9 / 5 + 32;
    }
}
