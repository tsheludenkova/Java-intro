package lesson02;
//Определить иерархию электроприборов.Включить некоторые в розетку.
//Посчитать потребляемую мощность Провести сортировку приборов в квартире на основе мощности.
//Найти прибор в квартире, соответствующий заданному диапазону параметров.

public class ElectricalDevices {
    String electricalDeviceName;
    String electricalDeviceLocation;
    int electricalDevicePower;

        public ElectricalDevices(String name, String location, int power) {
            electricalDeviceName = name;
            electricalDeviceLocation = location;
            electricalDevicePower = power;
        }


        public void getGetElectricalDeviceInfo() {
            System.out.println("ElectricalDevice: " + electricalDeviceName + " Location: " + electricalDeviceLocation + " Power: " + electricalDevicePower);
        }
        public static class NoisyElectricalDevises extends ElectricalDevices{
            public int noisyLevel;

        public NoisyElectricalDevises (String name, String location, int power, int noisy) {
          super(name, location, power);
          noisyLevel = noisy;
      }

        @Override
        public void getGetElectricalDeviceInfo() {
            System.out.println("ElectricalDevice: " + electricalDeviceName + " Location: " + electricalDeviceLocation + " Power: " + electricalDevicePower + " NoisyLevel: " + noisyLevel);
          }

   }


    public static void main(String[] args) {
        ElectricalDevices device1 = new ElectricalDevices("Microwave", "Kitchen", 1000);
        ElectricalDevices device2 = new ElectricalDevices("Vacuum", "Room", 1500);
        ElectricalDevices device3 = new NoisyElectricalDevises("Fridge", "Kitchen", 100, 35);
        device1.getGetElectricalDeviceInfo();
        device2.getGetElectricalDeviceInfo();
        device3.getGetElectricalDeviceInfo();
    }



}



