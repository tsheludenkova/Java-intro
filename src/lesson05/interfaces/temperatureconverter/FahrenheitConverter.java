package lesson05.interfaces.temperatureconverter;

public class FahrenheitConverter implements Converter{
    @Override
    public int showBaseValueTemperature(int temperature) {
        return temperature;
    }

    public double getConvertedValueFromKelvinToFahrenheit(double temperature) {
        return (temperature - 273)*1.8+32;
    }

    public double getConvertedValueFromCelsiusToFahrenheit(double temperature) {
        return (temperature*(9/5) +32);
    }
}
