package utils;

// This utility class is responsible for converting weather codes
// to corresponding Font Awesome icon classes, which are used for
// displaying appropriate weather icons in the front-end.
public class IconsUtils {

  // This method takes an integer weather code as input and returns
  // a corresponding Font Awesome icon class as a string.
  public static String weatherCodeToIconClass(int code) {
    String iconClass;

    // The switch statement checks the input weather code and
    // assigns the corresponding Font Awesome icon class.
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
      default: // Unknown weather code
        iconClass = "fas fa-question";
    }

    // The method returns the appropriate Font Awesome icon class
    // as a string.
    return iconClass;
  }
}