package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void main(String[] args){
        toFahrenheit(26);
    }
    public static void toFahrenheit(int temperatureCelsius){
        double cel = temperatureCelsius * 1.8 + 32;
        System.out.println(cel);
    }
}
