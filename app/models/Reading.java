// This is the "models" package where we define the data models for our application.
package models;

// Import necessary classes for the JPA entity.
import javax.persistence.Entity;

// Import the Play Framework's Model class, which provides JPA support.
import play.db.jpa.Model;

// Annotate the class with @Entity to indicate that it is a JPA entity.
@Entity
public class Reading extends Model {
  // Declare variables to store weather reading attributes.
  public int code;
  public double temperature;
  public double windSpeed;
  public int pressure;
  public int windDirection;

  /**
   * Constructor for the Reading class.
   *
   * @param code          The weather condition code (e.g., 200 for thunderstorm)
   * @param temperature   The temperature value in degrees Celsius
   * @param windSpeed     The wind speed value in meters per second
   * @param pressure      The air pressure value in hPa (hectopascal)
   * @param windDirection The wind direction value in degrees (0-360)
   */
  public Reading(int code, double temperature, double windSpeed, int pressure, int windDirection) {
    // Initialize the class variables with the provided values.
    this.code = code;
    this.temperature = temperature;
    this.windSpeed = windSpeed;
    this.pressure = pressure;
    this.windDirection = windDirection;
  }
}