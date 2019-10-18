package lesson05.temperature_converter;

import java.util.Scanner;

public class ProgramConverter {
    public static void main(String[] args) {

       do {
           Scanner scanner = new Scanner(System.in);
           int scale;
           System.out.printf("Please enter scale: 1 - Celsius; 2 - Kelvin; 3 - Fahrenheit :");
           scale = scanner.nextInt();

           int temperature;
           System.out.print("Please enter temperature : ");
           temperature = scanner.nextInt();

           KelvinConverter kelvin = new KelvinConverter();
           CelsiusConverter celsius = new CelsiusConverter();
           FahrenheitConverter fahrenheit = new FahrenheitConverter();

           switch (scale) {
               case 1:
                   System.out.println("Celsius temperature = " + celsius.showBaseValueTemperature(temperature));
                   System.out.println("Kelvin temperature = " + kelvin.getConvertedValueFromCelsiusToKelvin(temperature));
                   System.out.println("Fahrenheit temperature = " + fahrenheit.getConvertedValueFromCelsiusToFahrenheit(temperature));
                   break;
               case 2:
                   System.out.println("Kelvin temperature = " + kelvin.showBaseValueTemperature(temperature));
                   System.out.println("Celsius temperature = " + celsius.getConvertedValueFromKelvinToCelsius(temperature));
                   System.out.println("Fahrenheit temperature = " + fahrenheit.getConvertedValueFromKelvinToFahrenheit(temperature));
                   break;
               case 3:
                   System.out.println("Fahrenheit temperature = " + fahrenheit.showBaseValueTemperature(temperature));
                   System.out.println("Celsius temperature = " + celsius.getConvertedValueFromFahrenheitToCelsius(temperature));
                   System.out.println("Kelvin temperature = " + kelvin.getConvertedValueFromFahrenheitToKelvin(temperature));
                   break;
           }
       } while (true);

    }
}
