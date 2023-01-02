import java.util.Scanner;

public class Temperature {
 public static void main(String[] args) {
  final int ADJUSTMENT = 32;
  final double CONVERSION_FACTOR = 5.0 / 9.0;
  double fahrenheitTemperature;

  Scanner input = new Scanner(System.in);

  System.out.print("Enter a degree in Fahrenheit: ");
  fahrenheitTemperature = input.nextDouble();

  double celsiusTemperature = ((fahrenheitTemperature - ADJUSTMENT) * CONVERSION_FACTOR);

  System.out.println(celsiusTemperature + " Celsius");

 }

}