package utils;

public class IconsUtils {

  public static String weatherCodeToIconClass(int code) {
    String iconClass;

    switch (code) {
      case 100: // Clear
        iconClass = "fas fa-sun";
        break;
      case 200: // Partial clouds
        iconClass = "fas fa-cloud-sun";
        break;
      case 300: // Cloudy
        iconClass = "fas fa-cloud";
        break;
      case 400: // Light Showers
        iconClass = "fas fa-cloud-rain";
        break;
      case 500: // Heavy Showers
        iconClass = "fas fa-cloud-showers-heavy";
        break;
      case 600: // Rain
        iconClass = "fas fa-cloud-showers-heavy";
        break;
      case 700: // Snow
        iconClass = "fas fa-snowflake";
        break;
      case 800: // Thunder
        iconClass = "fas fa-bolt";
        break;
      default:
        iconClass = "fas fa-question";
    }

    return iconClass;
  }
}
