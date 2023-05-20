// This package contains utility classes used throughout the application.
package utils;

// Import the required classes for the utility methods.
import java.util.List;
import models.Reading;

// The StationUtils class provides utility methods for calculating and returning
// minimum and maximum values of temperature, wind speed, and pressure from a list of readings.
public class StationUtils {

  /**
   * The minTemperature method takes a list of readings and returns the minimum temperature.
   * If the list is empty, it returns Double.NaN (Not a Number).
   *
   * @param readings The list of Reading objects.
   * @return The minimum temperature value as a double.
   */
  public static double minTemperature(List<Reading> readings) {
    return readings.stream().mapToDouble( reading -> reading.temperature ).min().orElse( Double.NaN );
  }

  /**
   * The maxTemperature method takes a list of readings and returns the maximum temperature.
   * If the list is empty, it returns Double.NaN (Not a Number).
   *
   * @param readings The list of Reading objects.
   * @return The maximum temperature value as a double.
   */
  public static double maxTemperature(List<Reading> readings) {
    return readings.stream().mapToDouble( reading -> reading.temperature ).max().orElse( Double.NaN );
  }

  /**
   * The minWindSpeed method takes a list of readings and returns the minimum wind speed.
   * If the list is empty, it returns Double.NaN (Not a Number).
   *
   * @param readings The list of Reading objects.
   * @return The minimum wind speed value as a double.
   */
  public static double minWindSpeed(List<Reading> readings) {
    return readings.stream().mapToDouble( reading -> reading.windSpeed ).min().orElse( Double.NaN );
  }

  /**
   * The maxWindSpeed method takes a list of readings and returns the maximum wind speed.
   * If the list is empty, it returns Double.NaN (Not a Number).
   *
   * @param readings The list of Reading objects.
   * @return The maximum wind speed value as a double.
   */
  public static double maxWindSpeed(List<Reading> readings) {
    return readings.stream().mapToDouble( reading -> reading.windSpeed ).max().orElse( Double.NaN );
  }

  /**
   * The minPressure method takes a list of readings and returns the minimum pressure.
   * If the list is empty, it returns Integer.MIN_VALUE.
   *
   * @param readings The list of Reading objects.
   * @return The minimum pressure value as an integer.
   */
  public static int minPressure(List<Reading> readings) {
    return readings.stream().mapToInt( reading -> reading.pressure ).min().orElse( Integer.MIN_VALUE );
  }

  /**
   * The maxPressure method takes a list of readings and returns the maximum pressure.
   * If the list is empty, it returns Integer.MAX_VALUE.
   *
   * @param readings The list of Reading objects.
   * @return The maximum pressure value as an integer.
   */
  public static int maxPressure(List<Reading> readings) {
    return readings.stream().mapToInt( reading -> reading.pressure ).max().orElse( Integer.MAX_VALUE );
  }
}