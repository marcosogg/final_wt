// Package declaration
package models;

// Importing necessary classes for data manipulation and persistence
import java.util.ArrayList;
import java.util.List;

// Importing JPA (Java Persistence API) related classes for entity management
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

// Importing Play Framework's Model class for database management
import play.db.jpa.Model;

// Entity annotation to mark this class as a JPA entity
@Entity
public class Station extends Model {
  // Defining instance variables for the station's name, latitude, and longitude
  public String name;
  public double latitude;
  public double longitude;

  // One-to-many relationship between a station and its readings
  // CascadeType.ALL ensures that any operation (persist, merge, remove, refresh) performed
  // on the parent entity (Station) will cascade to the child entity (Reading)
  @OneToMany(cascade = CascadeType.ALL)
  public List<Reading> readings = new ArrayList<Reading>();

  // Transient annotation marks this field to be excluded from persistence
  // Stores the latest reading for a particular station
  @Transient
  public Reading latestReading;

  // Constructor for the Station class with parameters for name, latitude, and longitude
  public Station(String name, double latitude, double longitude) {
    this.name = name;
    this.latitude = latitude;
    this.longitude = longitude;
  }
}