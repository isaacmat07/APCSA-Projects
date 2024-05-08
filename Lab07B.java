import java.awt.Color;
import java.util.ArrayList;

public class Lab07B extends Object
{
  //precondition: menu != null
  public static void addShapesTo(ArrayList<Shape> menu)
  {
    // x = 10, y = 60
     menu.add( new Shape(10, 60, Color.ORANGE) );

    // x = 10, y = 80
     menu.add( new Shape(10, 80, Color.RED) );

    // x = 500, y = 300, r = 100
    menu.add( new Circle(500, 300, 100, Color.CYAN) );

    // x = 100, y = 125, w = 70, h = 140
    menu.add( new Rectangle(100, 125, 70, 140, Color.PINK) );

    // x = 500, y = 200, w = 100, h = 50
    menu.add( new Rectangle(500, 200, 100, 50, Color.BLUE) );

    // x = 200, y = 275, w = 200
    menu.add( new Square(200, 275, 200, Color.GREEN) );

    // x = 350, y = 75, r = 80, shading starts at θ = 90°, and shade 150° ccw
    menu.add( new Sector(350, 75, 80, 90, 150, Color.MAGENTA) );

    // x = 0, y = 300, r = 50, shading starts at θ = 45°, and shade 270° ccw
    menu.add( new Sector(0, 300, 50, 45, 270, Color.YELLOW.darker()) );
  }
  
  //precondition: s != null
  public static void doStuff(Shape something)
  {
    something.setColor(Color.LIGHT_GRAY);
    something.moveTo(something.getX()+25,something.getY()+25);
    // Write this method in step #13 of the lab handout...
  }

}