package lesson05.temperature_converter;

public class KelvinConverter implements Converter{
    @Override
    public int showBaseValueTemperature(int temperature) {
        return temperature;
    }

    public double getConvertedValueFromCelsiusToKelvin(double temperature) {
        return temperature + 273;
    }

    public double getConvertedValueFromFahrenheitToKelvin(double temperature) {
        return ((temperature + 459) * 0.55555);
    }

}
