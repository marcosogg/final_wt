package controllers;

import java.util.List;

import models.Station;
import models.Reading;
import play.mvc.Controller;
import utils.IconsUtils;

public class Dashboard extends Controller {
  public static void index() {
    List<Station> stations = Station.findAll();
    for (Station station : stations) {
      if (!station.readings.isEmpty()) {
        station.latestReading = station.readings.get( station.readings.size() - 1 );
      }
    }
    render( "Dashboard.html", stations, IconsUtils.class );
  }

  public static void addStation(String stationName, double latitude, double longitude) {
    Station station = new Station( stationName, latitude, longitude );
    station.save();
    index();
  }

  public static void addReading(long id, int code, double temperature, double windSpeed, int pressure, int windDirection) {
    Station station = Station.findById( id );
    if (station != null) {
      Reading reading = new Reading( code, temperature, windSpeed, pressure, windDirection );
      station.readings.add( reading );
      station.save();
    }
    index();
  }

}