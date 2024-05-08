import java.awt.Color;
import java.awt.Graphics;


/*
 * File Name: Sector.java
 *   Created: Feb 20, 2023
 *    Author: 
 */

public class Sector extends Shape 
{
    private int r,h,sa, sd;
  public Sector(int x, int y, int r1, int sa1, int sd1, Color c)
    {
      super(x,y,c);//calls Shape
r=r1;
      sd=sd1;
      sa=sa1;
    }
    @Override
    public String getName()
    {
      return "Sector";
    }
    @Override
    public double getArea()
    {
      return (sd/360.0*3.14159*r*r);
    }
    @Override
    public void drawOnto(Graphics g)
    {
      super.drawOnto(g);
      g.setColor(super.getColor());
      g.fillArc(super.getX(),super.getY(),2*r,2*r,sa, sd);
    }
}
