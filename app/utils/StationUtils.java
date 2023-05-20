package utils;

import java.util.List;

import models.Reading;

public class StationUtils {
  public static double minTemperature(List<Reading> readings) {
    return readings.stream().mapToDouble( reading -> reading.temperature ).min().orElse( Double.NaN );
  }

  public static double maxTemperature(List<Reading> readings) {
    return readings.stream().mapToDouble( reading -> reading.temperature ).max().orElse( Double.NaN );
  }

  public static double minWindSpeed(List<Reading> readings) {
    return readings.stream().mapToDouble( reading -> reading.windSpeed ).min().orElse( Double.NaN );
  }

  public static double maxWindSpeed(List<Reading> readings) {
    return readings.stream().mapToDouble( reading -> reading.windSpeed ).max().orElse( Double.NaN );
  }

  public static int minPressure(List<Reading> readings) {
    return readings.stream().mapToInt( reading -> reading.pressure ).min().orElse( Integer.MIN_VALUE );
  }

  public static int maxPressure(List<Reading> readings) {
    return readings.stream().mapToInt( reading -> reading.pressure ).max().orElse( Integer.MAX_VALUE );
  }
}