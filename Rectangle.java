import java.awt.Color;
import java.awt.Graphics;


/*
 * File Name: Rectangle.java
 *   Created: Feb 20, 2023
 *    Author: 
 */

public class Rectangle extends Shape 
{
  private int w, h;
  public Rectangle(int x, int y, int w1, int h1, Color z)
  {
    super(x,y,z);//calls Shape
w=w1;
    h=h1;
  }
  @Override
  public String getName()
  {
    return "Rectangle";
  }
  @Override
  public double getArea()
  {
    return (w*h);
  }
  @Override
  public void drawOnto(Graphics g)
  {
    super.drawOnto(g);
    g.setColor(super.getColor());
    g.fillRect(super.getX(), super.getY(), w,h);
  }
}
