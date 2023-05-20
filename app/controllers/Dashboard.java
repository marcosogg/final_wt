package controllers;

import java.util.List;

import models.Station;
import models.Reading;
import play.mvc.Controller;
import utils.IconsUtils;

// Dashboard controller serves as the main controller of the weather station web application.
// It handles all the actions related to stations and readings and renders the main HTML view.
public class Dashboard extends Controller {

  // Index action renders the main dashboard by retrieving all stations and their latest readings.
  public static void index() {
    // Fetch all stations from the database
    List<Station> stations = Station.findAll();

    // Retrieve the latest reading for each station
    for (Station station : stations) {
      if (!station.readings.isEmpty()) {
        station.latestReading = station.readings.get( station.readings.size() - 1 );
      }
    }
    // Render the Dashboard.html view with the list of stations and their latest readings, and the IconsUtils class
    render( "Dashboard.html", stations, IconsUtils.class );
  }

  // addStation action creates a new weather station with the given parameters and saves it to the database.
  public static void addStation(String stationName, double latitude, double longitude) {
    // Create a new station object using the provided parameters
    Station station = new Station( stationName, latitude, longitude );

    // Save the new station object to the database
    station.save();

    // Redirect to the dashboard index
    index();
  }

  // addReading action creates a new weather reading for a station with the given id and saves it to the associated station.
  public static void addReading(long id, int code, double temperature, double windSpeed, int pressure, int windDirection) {
    // Find the station object with the given id
    Station station = Station.findById( id );

    // Check if the station exists
    if (station != null) {
      // Create a new reading object using the provided parameters
      Reading reading = new Reading( code, temperature, windSpeed, pressure, windDirection );

      // Add the new reading to the station's readings list
      station.readings.add( reading );

      // Save the updated station object to the database
      station.save();
    }

    // Redirect to the dashboard index
    index();
  }

}