package lesson05.temperature_converter;

public class CelsiusConverter implements Converter {
    @Override
    public int showBaseValueTemperature(int temperature) {
        return temperature;
    }

    public double getConvertedValueFromKelvinToCelsius(double temperature) {
        return temperature - 273;
    }

    public double getConvertedValueFromFahrenheitToCelsius(double temperature) {
        return ((temperature - 32)/1.8);
    }
}
