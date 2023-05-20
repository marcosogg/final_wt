package utils;

public class WeatherUtils {
  public static String weatherCodeToDescription(int code) {
    switch (code) {
      case 100:
        return "Clear";
      case 200:
        return "Partial clouds";
      case 300:
        return "Cloudy";
      case 400:
        return "Light Showers";
      case 500:
        return "Heavy Showers";
      case 600:
        return "Rain";
      case 700:
        return "Snow";
      case 800:
        return "Thunder";
      default:
        return "Unknown";
    }
  }

  public static double celsiusToFahrenheit(double celsius) {
    return celsius * 9.0 / 5.0 + 32;
  }

  public static int kmhToBeaufort(double windSpeed) {
    if (windSpeed <= 1) return 0;
    if (windSpeed <= 5) return 1;
    if (windSpeed <= 11) return 2;
    if (windSpeed <= 19) return 3;
    if (windSpeed <= 28) return 4;
    if (windSpeed <= 38) return 5;
    if (windSpeed <= 49) return 6;
    if (windSpeed <= 61) return 7;
    if (windSpeed <= 74) return 8;
    if (windSpeed <= 88) return 9;
    if (windSpeed <= 102) return 10;
    if (windSpeed <= 117) return 11;
    return 12;
  }

  public static String windDirectionToCompass(int windDirection) {
    if (windDirection >= 348.75 || windDirection < 11.25) return "N";
    if (windDirection >= 11.25 && windDirection < 33.75) return "NNE";
    if (windDirection >= 33.75 && windDirection < 56.25) return "NE";
    if (windDirection >= 56.25 && windDirection < 78.75) return "ENE";
    if (windDirection >= 78.75 && windDirection < 101.25) return "E";
    if (windDirection >= 101.25 && windDirection < 123.75) return "ESE";
    if (windDirection >= 123.75 && windDirection < 146.25) return "SE";
    if (windDirection >= 146.25 && windDirection < 168.75) return "SSE";
    if (windDirection >= 168.75 && windDirection < 191.25) return "S";
    if (windDirection >= 191.25 && windDirection < 213.75) return "SSW";
    if (windDirection >= 213.75 && windDirection < 236.25) return "SW";
    if (windDirection >= 236.25 && windDirection < 258.75) return "WSW";
    if (windDirection >= 258.75 && windDirection < 281.25) return "W";
    if (windDirection >= 281.25 && windDirection < 303.75) return "WNW";
    if (windDirection >= 303.75 && windDirection < 326.25) return "NW";
    return "NNW";
  }

  public static double calculateWindChill(double temperatureC, double windSpeedKmh) {
    double windVelocityPower = Math.pow( windSpeedKmh, 0.16 );
    return 13.12 + 0.6215 * temperatureC - 11.37 * windVelocityPower + 0.3965 * temperatureC * windVelocityPower;
  }
}
