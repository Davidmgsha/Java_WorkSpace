package Session1.Exercise3;
public class TempConverter{
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) +32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit -32) *5/9;
    }
    public static double celsiusToKelvin(double celsius){
        return(celsius + 273.15);
    }
    public static void main(String[] args){
        double fahrenheit1 = celsiusToFahrenheit(0);
        double fahrenheit2 = celsiusToFahrenheit(100);
        double celsius = fahrenheitToCelsius(212);
        double kelvin = celsiusToKelvin(0);

        System.out.println("O°C = "+ String.format("%.2f", fahrenheit1) +"°F");
        System.out.println("100°C = "+ String.format("%.2f", fahrenheit2)+"°F");
        System.out.println("212°F = "+ String.format("%.2f", celsius)+"°C");
        System.out.println("0°C = "+ String.format("%.2f", kelvin)+"°K");
    }
}