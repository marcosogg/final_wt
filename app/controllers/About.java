// Import necessary packages
package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

// Define the About controller class, extending the Play Framework's Controller class
public class About extends Controller {

  // Define the index method that renders the "about.html" template
  public static void index() {

    // Log the action of rendering the "about" page for debugging purposes
    Logger.info("Rendering about");

    // Render the "about.html" template and send it to the user's browser
    render("about.html");
  }
}