import java.awt.Color;
import java.awt.Graphics;


/*
 * File Name: Circle.java
 *   Created: Feb 20, 2023
 *    Author: 
 */

public class Circle extends Shape 
{
  private int r1;
public Circle(int x, int y, int r, Color c)
  {
    super(x,y,c);//calls Shape

    r1=r;
  }
  @Override
  public String getName()
  {
    return "Circle";
  }
  @Override
  public double getArea()
  {
    return (3.14159*r1*r1);
  }
  @Override
  public void drawOnto(Graphics g)
  {
    super.drawOnto(g);
    g.setColor(super.getColor());
    g.fillOval(super.getX(),super.getY(),2*r1,2*r1);
  }
  
}
