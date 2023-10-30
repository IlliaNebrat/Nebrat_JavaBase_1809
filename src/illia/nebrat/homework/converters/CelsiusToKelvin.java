package illia.nebrat.homework.converters;


public class CelsiusToKelvin extends TemperatureConverter {
    public double convertToCelsius(double temperature) {
        return temperature - 273.15;
    }

    public double convertFromCelsius(double temperature) {
        return temperature + 273.15;
    }
}
