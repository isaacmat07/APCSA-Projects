import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
/*
 * File Name: Shape.java
 *   Created: Feb 20, 2023
 *    Author: 
 */

public class Shape extends Object
{
  private int x,y;
  private Color c;
  private String name;
  private double area;
public Shape(int x1,int y1,Color z)
  {
    x=x1;
    y=y1;
    c=z;
  }
  public int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }
  public void setColor(Color b)
  {
    c=b;
  }
  public Color getColor()
  {
    return c;
  }
  public void moveTo(int q, int w)
  {
    x=q;
    y=w;
  }
  public String getName()
  {
    return "Shape";
  }
  public double getArea()
  {
    return 0.0;
  }
  public void drawOnto(Graphics g)
  {
    g.setColor(Color.BLACK);
    g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
    g.drawString(this.getName()+": A = "+this.getArea(), this.getX(), this.getY());
  }
  @Override
  public String toString()
  {
    return this.getName()+" ("+this.getX()+","+this.getY()+")";
  }
}