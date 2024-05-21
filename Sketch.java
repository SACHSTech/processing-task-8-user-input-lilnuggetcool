import processing.core.PApplet;

public class Sketch extends PApplet {
  
  // Define colors
  int backgroundColor;
  int rectColor;
  int ellipseColor;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // Set the size of the window
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution. Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    // Initialize colors
    backgroundColor = color(210, 255, 173);
    rectColor = color(100, 150, 200);
    ellipseColor = color(255, 100, 150);
    
    // Set the background color
    background(backgroundColor);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Clear the background
    background(backgroundColor);

    // Draw a rectangle in the center of the canvas
    fill(rectColor);
    rectMode(CENTER);
    rect(width / 2, height / 2, 150, 100);

    // Draw an ellipse that follows the mouse
    fill(ellipseColor);
    noStroke();
    ellipse(mouseX, mouseY, 50, 50);
  }

  /**
   * Called when mouse is pressed
   */
  public void mousePressed() {
    // Change the background color randomly on mouse press
    backgroundColor = color(random(255), random(255), random(255));
  }

  // Define other methods down here if needed
}
